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

    private ArrayList<Point> pixels;
    private Color color;

    /**
     */
    public DrawableLine() {
        pixels = new ArrayList<>();
        color = new Color(0,0,0);
    }

    /**
     * Paint the line to the screen
     * @param g
     */
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

    /**
     * Add a new point to the line
     * @param x
     * @param y
     */
    @Override
    public void update_from_pos(int x, int y) {
        pixels.add(new Point(x, y));
    }

    /**
     * Set the line origin. Unused
     * @param x
     * @param y
     */
    @Override
    public void set_origin(int x, int y) {
        
    }

    /**
     * Set the line color
     * @param color The color
     */
    @Override
    public void set_color(Color color) {
        this.color=color;        
    }

    /**
     * Get the line color
     * @return The color
     */
    @Override
    public Color get_color() {
        return this.color;
    }

}
