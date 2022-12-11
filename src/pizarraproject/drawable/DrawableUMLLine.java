/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarraproject.drawable;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author nwroot
 */
public class DrawableUMLLine implements Drawable {
    private int x1, y1, x2, y2;
    public DrawableUMLClass origin, dest;
    public int origin_which, dest_which;
    
    
    @Override
    public void paint(Graphics g) {
        x1 = origin.get_bind_x(origin_which);
        y1 = origin.get_bind_y(origin_which);
        x2 = dest.get_bind_x(dest_which);
        y2 = dest.get_bind_y(dest_which);
        g.drawLine(x1, y1, x2, y2);
    }

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
    public void bind_to_uml_dest(DrawableUMLClass other, int which) {
        dest = other;
        dest_which = which;
    }
    public void bind_to_uml_origin(DrawableUMLClass other, int which) {
        origin = other;
        origin_which = which;
    }
}
