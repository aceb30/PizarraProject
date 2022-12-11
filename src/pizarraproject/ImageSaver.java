
package pizarraproject;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageSaver {
    private JPanel board;
    public ImageSaver(JPanel pizarra){
        board = pizarra;
    }
    
    public static BufferedImage printScreen(JPanel panel) throws AWTException {     
    Point p = panel.getLocationOnScreen();
    Dimension dim = panel.getSize();
    Rectangle rect = new Rectangle(p, dim);

    Robot robot = new Robot();  
    return robot.createScreenCapture(rect);
    }
    
    public void save(BufferedImage image) throws IOException{
        File outputfile = new File("image.jpg");
        ImageIO.write(image, "jpg", outputfile);
    }
}
