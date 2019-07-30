import java.awt.image.BufferedImage;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedImage clean = ImageIO.read(new File("C:/Users/Delta5/Desktop/sample_landscape.jpg"));
            BufferedImage watermark = ImageIO.read(new File("C:/Users/Delta5/Desktop/sample_watermark.png"));
            Watermarker watermarker = new Watermarker(clean, watermark);
            watermarker.markSingleImage(new File("C:/Users/Delta5/Desktop"));
        } catch(IOException e) {
            e.printStackTrace();
        }        
    }
}
