
package pizarraproject;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Window extends JFrame {
    private Pizarra pizarra;
    private Barra barra;
    public Window() throws IOException{
        barra = new Barra();
        pizarra = new Pizarra();
  
        this.setLayout(new BorderLayout());
        
        this.setTitle("Pizarra Project");
        this.setSize(1300, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        
        ImageIcon image = new ImageIcon("Board.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(126, 114, 159));
        
        this.add(barra, BorderLayout.WEST);
        this.add(pizarra, BorderLayout.EAST);
        
        this.setVisible(true);
        
        
    }
}
