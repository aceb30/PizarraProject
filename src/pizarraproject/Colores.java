package pizarraproject;

import pizarraproject.guicontrols.BotonesColores;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author nwroot
 */
public class Colores extends JPanel{
    
    BotonesColores botones;
    
    /**
     * Constructor for Colores
     */
    public Colores(){
                
        this.setPreferredSize(new Dimension(180, 300));
        this.setBackground(Color.LIGHT_GRAY);

        this.setLayout(null);
        
        botones = new BotonesColores(this);
 
    }
    
    
}
