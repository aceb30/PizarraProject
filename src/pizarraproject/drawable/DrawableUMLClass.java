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
public class DrawableUMLClass implements Drawable {
    public int x;
    public int y;
    
    public int w;
    public int h;
    
    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(x, y, w, h, 10, 10);
    }

    @Override
    public void update_from_pos(int x, int y) {
        this.w = -this.x + x;
        this.h = -this.y + y;
    }

    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void set_color(Color color) {
    }

    @Override
    public Color get_color() {
    }
}
