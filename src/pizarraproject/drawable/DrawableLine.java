package pizarraproject.drawable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author nwroot
 */
public class DrawableLine implements Drawable {

    public ArrayList<Point> pixels;
    public Color color;

    public DrawableLine() {
        pixels = new ArrayList<Point>();
        color = new Color(0, 0, 0);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < this.pixels.size(); i++) {
            Point p = this.pixels.get(i);
            g.setColor(color);
            g.drawLine(p.x, p.y, p.x, p.y);
            try {
                Point before = this.pixels.get(i - 1);
                g.drawLine(before.x, before.y, p.x, p.y);
            } catch (Exception e) {
                // lol, lmao
            }
        }
    }

    @Override
    public void update_from_pos(int x, int y) {
        pixels.add(new Point(x, y));
    }

    @Override
    public void setColor(Color color) {
        this.color=color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
    
    
    
    
}
