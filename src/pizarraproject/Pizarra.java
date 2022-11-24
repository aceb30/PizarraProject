
package pizarraproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Pizarra extends JPanel{
    private JLabel label;
    public Pizarra() throws IOException{
        
        this.setPreferredSize(new Dimension(1300, 600));
        this.setBackground(new Color(250, 250, 250));
        /* Tried to add image, need fixes.
        label = new JLabel();
        BufferedImage bufferedImage = ImageIO.read(new File("Whiteboard.png"));
        Image image = bufferedImage.getScaledInstance(1350,600, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        this.add(label);
        */
        
        
    }
}
