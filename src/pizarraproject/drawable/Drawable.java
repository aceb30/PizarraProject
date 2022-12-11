package pizarraproject.drawable;

import java.awt.Color;
import java.awt.Graphics;

public interface Drawable {

    public void paint(Graphics g);

    public void update_from_pos(int x, int y);
    
    public void set_origin(int x, int y);

    public void set_color(Color color);
    public Color get_color();
    }
