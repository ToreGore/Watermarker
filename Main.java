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
        String clean = new String(args[0]);
        String watermark = new String(args[1]);
        Watermarker watermarker = new Watermarker(clean, watermark);
        //watermarker.markSingleImage(new File("./Desktop_" + clean.substring(clean.lastIndexOf('/') + 1)));
	watermarker.markSingleImage(new File("./Desktop_" + args[2]));
          
    }
}
