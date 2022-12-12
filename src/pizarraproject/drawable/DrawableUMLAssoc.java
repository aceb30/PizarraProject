/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizarraproject.drawable;

import java.awt.Graphics;

/**
 * Association UML line
 * @author nwroot
 */
public class DrawableUMLAssoc extends DrawableUMLLine {

    /**
     * Paint to the screen
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        drawArrowLine(g, x1, y1, x2, y2, 10, 10, false, false);
    }
}
