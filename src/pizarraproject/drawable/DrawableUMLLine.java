/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarraproject.drawable;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author nwroot
 */
public class DrawableUMLLine implements Drawable {

    protected int x1, y1, x2, y2;

    @Override
    public void update_from_pos(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    @Override
    public void set_origin(int x, int y) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x;
        this.y2 = y;
    }

    @Override
    public void set_color(Color color) {
    }

    @Override
    public Color get_color() {
        return null;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    protected void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h, boolean fill, boolean dotted) {
        int dx = x2 - x1, dy = y2 - y1;
        double D = Math.sqrt(dx * dx + dy * dy);
        double xm = D - d, xn = xm, ym = h, yn = -h, x;
        double sin = dy / D, cos = dx / D;

        x = xm * cos - ym * sin + x1;
        ym = xm * sin + ym * cos + y1;
        xm = x;

        x = xn * cos - yn * sin + x1;
        yn = xn * sin + yn * cos + y1;
        xn = x;

        int[] xpoints = {x2, (int) xm, (int) xn};
        int[] ypoints = {y2, (int) ym, (int) yn};

        if(!dotted) g.drawLine(x1, y1, x2, y2);
        else {
            Graphics2D g2d = (Graphics2D) g;
            Stroke old = g2d.getStroke();
            float dash[] = { 2f, 0f, 2f};
            g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f, dash, 2f));
            g.drawLine(x1, y1, x2, y2);
            g2d.setStroke(old);
        }
        g.drawLine(x2, y2, (int)xm, (int)ym);
        g.drawLine(x2, y2, (int)xn, (int)yn);
        if(fill) g.drawPolygon(xpoints, ypoints, 3);
    }
}
