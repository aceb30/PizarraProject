package pizarraproject;

import GUIControls.BotonesColores;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Colores extends JPanel{
    
    BotonesColores colors;
    
    public Colores(){
        
        //this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.YELLOW);
        
        this.setLayout(null);
        
        //colors = new BotonesColores(this);
        
        this.revalidate();
        this.repaint();
    
    }
    
    
}
