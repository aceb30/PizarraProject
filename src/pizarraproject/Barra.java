
package pizarraproject;
import GUIControls.*;

import java.awt.*;
import javax.swing.*;


public class Barra extends JPanel{
    Mode modos;
    Editar barraEditar;
    Borrar barraBorrar;
    Window ventana;
    
    //GridBagConstraints gbc;
    public Barra(Window window_aux){
        ventana = window_aux;
        this.setLayout(new BorderLayout());
        //this.setLayout(new GridBagLayout());
        //gbc = new GridBagConstraints();

        this.setPreferredSize(new Dimension(300, 650));
        this.setBackground(new Color(93, 142, 113));
        
        
        barraEditar = new Editar();
        barraBorrar = new Borrar();
        
        
        this.add(barraEditar, BorderLayout.EAST);
        this.add(barraBorrar, BorderLayout.WEST);
        
        
        
        barraEditar.setVisible(true);
        barraBorrar.setVisible(false);
        
        modos = new Mode(this);
       
  
        
        
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

    
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==editar){
            System.out.println("Modo Editar");
            barraEditar.setVisible(true);
            barraBorrar.setVisible(false);
        }
        if(e.getSource()==borrar){
            System.out.println("Modo Borrar");
            barraEditar.setVisible(false);
            barraBorrar.setVisible(true);
        }
    }
      */
    
    public Borrar getBorrar(){
        return barraBorrar;
    }
    public Editar getEditar(){
        return barraEditar;
    }
}