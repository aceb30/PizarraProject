package pizarraproject;
import pizarraproject.guicontrols.Mode;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nwroot
 */
public class Barra extends JPanel{
    
    Editar barraEditar;
    Borrar barraBorrar;
    Colores barraColores;
    
    //GridBagConstraints gbc;

    /**
     * Constructor for Barra 
     * @param window_aux
     * @param p
     */
    public Barra(Window window_aux, PizarraContainer p){
        

        this.setPreferredSize(new Dimension(180, 450));
        this.setBackground(Color.LIGHT_GRAY);
                
        barraEditar = new Editar(p);
        barraBorrar = new Borrar();   
        barraColores = new Colores();
        
        new Mode(this);
        
        this.add(barraEditar, BorderLayout.SOUTH);
        this.add(barraBorrar, BorderLayout.SOUTH);
        this.add(barraColores, BorderLayout.SOUTH);
                        
        barraEditar.setVisible(true);
        barraBorrar.setVisible(false);
                                         
        /* X and y positions
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(editar, gbc);
        
        gbc.gridx = 50;
        gbc.gridy = 0;
        add(borrar, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 50;
        add(barraEditar, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 50;
        add(barraBorrar, gbc);
        
        this.revalidate();
        this.repaint
        */
    }

    /**
     * Getter for BarraBorrar
     * @return barraBorrar
     */

    
    public Borrar getBorrar(){
        return barraBorrar;
    }

    /**
     * Getter for BarraEditar
     * @return barraEditar
     */
    public Editar getEditar(){
        return barraEditar;
    }
}