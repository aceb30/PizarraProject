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
import pizarraproject.drawable.Drawable;
import pizarraproject.drawable.DrawableLine;
import pizarraproject.drawable.DrawableUMLAssoc;
import pizarraproject.drawable.DrawableUMLClass;
import pizarraproject.drawable.DrawableUMLLine;

public class Pizarra extends JPanel {

    public static Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JLabel label;
    private static int mode = 1;
    private static Color color;
    public Pizarra() throws IOException {
        this.drawn = new ArrayList<Drawable>();

        this.setPreferredSize(new Dimension(975, 600));
        this.setBackground(new Color(250, 250, 250));
        Listener listener = new Listener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener);
    }

    private ArrayList<Drawable> drawn;
    private  Drawable curr;

    class Listener extends MouseInputAdapter {

        @Override
        
        public void mousePressed(MouseEvent m) {
                        
            if (mode==1) {
                curr = new DrawableUMLClass();  
            }
            if (mode==2) {
                curr = new DrawableLine();                
            }
            if (mode==3){
                curr = new DrawableUMLAssoc();
            }
            curr.set_color(color);
            curr.set_origin(m.getX(), m.getY());
            repaint();
            
            System.out.println(mode);
        }

        public void mouseDragged(MouseEvent m) {
            curr.update_from_pos(m.getX(), m.getY());
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
            drawn.get(i).paint(g);
        }
        if (this.curr != null) {
            curr.paint(g);
        }
    }
    
    public static void setMode(int m) {
        mode = m;
    }
    
    public static void setColor(Color c) {
        color = c;
    }
    
    public void remove(){
        drawn.remove(curr);
        curr=null;
        repaint();        
    }
    
/*
    private interface Drawn {
        public void paint(Graphics g);
        public void update_from_pos(int x, int y);
    }
    
    private class DrawnPixels implements Drawn {

        public DrawnPixels() {
            pixels = new ArrayList<Point>();
            color = new Color(0,0,0);
        }

        public void paint(Graphics g) {
            for (int i = 0; i < this.pixels.size(); i++) {
                Point p = this.pixels.get(i);
                g.setColor(color);
                g.drawLine(p.x, p.y, p.x, p.y);
                try {Point before = this.pixels.get(i - 1); g.drawLine(before.x, before.y, p.x, p.y);}
                catch (Exception e) {
                    // lol, lmao
                }
            }
        }
        public ArrayList<Point> pixels;
        public Color color;

        @Override
        public void update_from_pos(int x, int y) {
            pixels.add(new Point(x, y));
        }
    }*/
}
