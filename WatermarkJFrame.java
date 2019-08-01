import javax.swing.*;
import java.awt.event.*;

public class WatermarkJFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public WatermarkJFrame() {
        initUI();
    }

    private void initUI() {
        JFrame frame = new JFrame("Watermarker");
        JButton quitButton = new JButton("Quit");
        final JLabel label = new JLabel("Watermarker!");
        label.setBounds(50,50, 150,20); 
        quitButton.setBounds(50,100,95,30);
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        frame.add(quitButton);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}