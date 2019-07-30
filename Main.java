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

            String clean = new String("/Users/Delta5/Desktop/sample_landscape.jpg");
            String watermark = new String("/Users/Delta5/Desktop/sample_watermark.png");
            Watermarker watermarker = new Watermarker(clean, watermark);
            watermarker.markSingleImage(new File("/Users/Delta5/Desktop"));
          
    }
}
