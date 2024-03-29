import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Watermarker {

    BufferedImage clean, watermark;
    ArrayList<BufferedImage> toBeMarked;

    public Watermarker() {
        this.toBeMarked = new ArrayList<>();
    }

    public Watermarker(String clean, String watermark) {
        this.toBeMarked = new ArrayList<>();
        try {
            File f_clean = new File(clean);
            File f_water = new File(watermark);
            this.clean = ImageIO.read(f_clean);
            this.watermark = ImageIO.read(f_water);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Watermarker(ArrayList<String> toBeMarked, String watermark) {
        this.toBeMarked = new ArrayList<>();
        File f_clean;
        File f_water = new File(watermark);
        try {
            for (String img : toBeMarked) {
                f_clean = new File(img);
                this.toBeMarked.add(ImageIO.read(f_clean));
            }
            this.watermark = ImageIO.read(f_water);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void markSingleImage(File destination) {
        try {
            Graphics2D g2d = (Graphics2D) clean.getGraphics();
            AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
            g2d.setComposite(alphaChannel);
            //Calculate image's coordinates
            int topLeftX = (clean.getWidth() - watermark.getWidth()) / 2;
            int topLeftY = (clean.getHeight() - watermark.getHeight()) / 2;
            //Paints the image
            g2d.drawImage(watermark, topLeftX, topLeftY, null);
            ImageIO.write(clean, "png", destination);
            g2d.dispose();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void markBatch(File destination) {
        for (BufferedImage img : toBeMarked) {
            try {
                Graphics2D g2d = (Graphics2D) img.getGraphics();
                AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
                g2d.setComposite(alphaChannel);
                //Calculate image's coordinates
                int topLeftX = (img.getWidth() - watermark.getWidth()) / 2;
                int topLeftY = (img.getHeight() - watermark.getHeight()) / 2;
                //Paints the image
                g2d.drawImage(watermark, topLeftX, topLeftY, null);
                ImageIO.write(img, "png", destination);
                g2d.dispose();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setClean(BufferedImage clean) {
        this.clean = clean;
    }

    public BufferedImage getClean() {
        return clean;
    }

    public void setWatermark(BufferedImage watermark) {
        this.watermark = watermark;
    }

    public BufferedImage getWatermark() {
        return watermark;
    }

}