
package pizarraproject;
import GUIControls.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Window extends JFrame {
    private Pizarra pizarra;
    private Barra barra;
   
    private MenuBar menu; 
    
    public Window() throws IOException{
        barra = new Barra(this);
        pizarra = new Pizarra();
  
        this.setLayout(new BorderLayout());
        
        this.setTitle("Pizarra Project");
        this.setSize(1300, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        
        ImageIcon image = new ImageIcon("Board.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(126, 114, 159));
        
        menu = new MenuBar();
           
        this.setJMenuBar(menu);
        
        this.getContentPane().add(barra, BorderLayout.WEST);
        this.getContentPane().add(pizarra, BorderLayout.EAST);
        
        
        this.setVisible(true);
        
        
    }
}

  
