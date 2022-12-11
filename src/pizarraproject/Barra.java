package pizarraproject;
import pizarraproject.guicontrols.Mode;

import java.awt.*;
import javax.swing.*;

public class Barra extends JPanel{
    
    Mode modos;
    Editar barraEditar;
    Borrar barraBorrar;
    Colores barraColores;
    Window ventana;
    
    //GridBagConstraints gbc;
    public Barra(Window window_aux, PizarraContainer p){
        
        ventana = window_aux;

        this.setPreferredSize(new Dimension(180, 450));
        this.setBackground(Color.BLACK);
                
        barraEditar = new Editar(p);
        barraBorrar = new Borrar();   
        barraColores = new Colores();
        
        modos = new Mode(this);
        
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