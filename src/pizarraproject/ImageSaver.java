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

/**
 *
 * @author nwroot
 */
public class ImageSaver {

    private JPanel board;

    /**
     * Creates an ImageSaver for a Pizarra
     *
     * @param pizarra
     */
    public ImageSaver(JPanel pizarra) {
        board = pizarra;
    }

    /**
     * Capture the screen to a BufferedImage
     * @param panel Panel to capture
     * @return The captured image
     * @throws AWTException
     */
    public static BufferedImage printScreen(JPanel panel) throws AWTException {
        Point p = panel.getLocationOnScreen();
        Dimension dim = panel.getSize();
        Rectangle rect = new Rectangle(p, dim);

        Robot robot = new Robot();
        return robot.createScreenCapture(rect);
    }

    /**
     * Save a BufferedImage to disk
     * @param image The BufferedImage to save
     * @throws IOException
     */
    public void save(BufferedImage image) throws IOException {
        File outputfile = new File("image.jpg");
        ImageIO.write(image, "jpg", outputfile);
    }
}
