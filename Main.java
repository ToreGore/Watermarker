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
            System.out.println("Before Clean!");
            String clean = new String("/Users/Delta5/Desktop/sample_landscape.jpg");
            System.out.println("After Clean, before Watermark!");
            String watermark = new String("/Users/Delta5/Desktop/sample_watermark.png");
            System.out.println("After Watermark, before Watermarker!");
            Watermarker watermarker = new Watermarker(clean, watermark);
            System.out.println("After Watermarker!");
            watermarker.markSingleImage(new File("/Users/Delta5/Desktop"));
          
    }
}
