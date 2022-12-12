/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarraproject.drawable;

import java.awt.Color;
import java.awt.Graphics;

/**
 * UML class, drawn as a rounded rectangle
 * @author nwroot
 */
public class DrawableUMLClass implements Drawable {

    private int x;
    private int y;
    private int w;
    private int h;
    
    /**
     * Paint to the screen
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(x, y, w, h, 10, 10);
    }

    /**
     * Set the bottom right corner
     * @param x
     * @param y
     */
    @Override
    public void update_from_pos(int x, int y) {
        this.w = -this.x + x;
        this.h = -this.y + y;
    }

    /**
     * Set the top left corner
     * @param x
     * @param y
     */
    @Override
    public void set_origin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the color. Unused
     * @param color
     */
    @Override
    public void set_color(Color color) {       
    }

    /**
     * Get the color. Unused
     * @return
     */
    @Override
    public Color get_color() {
        return null;
    }
}
