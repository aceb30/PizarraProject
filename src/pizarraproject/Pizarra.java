package pizarraproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

public class Pizarra extends JPanel {

    private JLabel label;
    public Pizarra() throws IOException {
        this.drawn = new ArrayList<Drawn>();

        this.setPreferredSize(new Dimension(975, 600));
        this.setBackground(new Color(250, 250, 250));
        Listener listener = new Listener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);

    }

    private ArrayList<Drawn> drawn;
    private Drawn curr;

    class Listener extends MouseInputAdapter {

        @Override
        public void mousePressed(MouseEvent m) {
            curr = new Drawn();
            curr.pixels.add(new Point(m.getX(), m.getY()));
            repaint();
        }

        public void mouseDragged(MouseEvent m) {
            curr.pixels.add(new Point(m.getX(), m.getY()));
            
            Point before = curr.pixels.get(curr.pixels.size() - 1);
            if(before != null) {
                
            }
            
            System.out.println("drag");
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            drawn.add(curr);
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent me) {

        }

        @Override
        public void mouseExited(MouseEvent me) {

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < drawn.size(); i++) {
            for (int j = 0; j < drawn.get(i).pixels.size(); j++) {
                Point p = drawn.get(i).pixels.get(j);
                g.drawLine(p.x, p.y, p.x, p.y);
                try {Point before = drawn.get(i).pixels.get(j - 1); g.drawLine(before.x, before.y, p.x, p.y);}
                catch (Exception e) {
                    // lol, lmao
                }
            }
        }
        if (this.curr != null) {
            for (int i = 0; i < this.curr.pixels.size(); i++) {
                Point p = this.curr.pixels.get(i);
                g.drawLine(p.x, p.y, p.x, p.y);
                try {Point before = this.curr.pixels.get(i - 1); g.drawLine(before.x, before.y, p.x, p.y);}
                catch (Exception e) {
                    // lol, lmao
                }
            }
        }
    }

    private static class Drawn {

        public Drawn() {
            pixels = new ArrayList<Point>();
        }

        public ArrayList<Point> pixels;
    }
}
