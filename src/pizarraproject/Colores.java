package pizarraproject;

import pizarraproject.guicontrols.BotonesColores;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Colores extends JPanel{
    
    BotonesColores botones;
    
    public Colores(){
        
        //this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.LIGHT_GRAY);

        this.setLayout(null);
        
        botones = new BotonesColores(this);
 
    }
    
    
}
