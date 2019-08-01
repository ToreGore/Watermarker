import java.awt.image.BufferedImage;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) throws IOException {
        
        String answer = new String();
        String image = new String();
        String watermark = new String();
        String newName = new String();
        System.out.println("Watermarking unit active");
        WatermarkJFrame frame = new WatermarkJFrame();
        do {
            System.out.println("\tWhich action would you like to exectute?");
            System.out.println("\n>\t+\t->\tWatermark an image");
            System.out.println("\n>\tBatch\t->\tWatermark more images together");
            System.out.println("\n>\tCredits\t->\tAbout me");
            System.out.println("\n>\tStop\t->\tExit program");
            System.out.print("Operation:\t");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            answer = reader.readLine();
            switch(answer) {
                case "+":
                    System.out.print("Path and name of watermarkable image:\t");
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    image = reader.readLine();
                    System.out.print("Path and name of watermark:\t");
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    watermark = reader.readLine();
                    System.out.print("Name of new image:\t");
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    newName = reader.readLine();
                    Watermarker watermarker = new Watermarker(image, watermark);
                    watermarker.markSingleImage(new File("./" + newName));
                    System.out.println("**Execution successful!**");
                break;
                case "Batch":
                    workInProgress();
                break;
                case "Credits":
                    System.out.println(aboutMe());
                break;
                case "Stop":
                    System.out.println("Thank you for your patronage! Have a nice day!");
			System.exit(0);
                break;
                default:
                    System.out.println("Operation denied. Retry!");
                break;
            }

        } while(!answer.equals("Stop"));

        
        //watermarker.markSingleImage(new File("./Desktop_" + clean.substring(clean.lastIndexOf('/') + 1)));
          
    }

    public static String aboutMe() {
        String aboutMe = new String("\tGithub Name:\tToreGore\n\tGithub Link:\thttps://github.com/ToreGore\n\tOccupation:\tCurrently enrolled in the Master of Computer Science at the University of Studies of Milan.");
        return aboutMe;
    }
    public static void workInProgress() {
        System.out.println("***************************************");
        System.out.println("** Functionality not yet implemented **");
        System.out.println("***************************************");
    }

}
