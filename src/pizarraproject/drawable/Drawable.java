package pizarraproject.drawable;

import java.awt.Graphics;

public interface Drawable {

    public void paint(Graphics g);

    public void update_from_pos(int x, int y);
}
