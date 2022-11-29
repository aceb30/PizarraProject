
package GUIControls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JButton;
import pizarraproject.*;

public class Mode extends JButton{
    
    JButton editar;
    JButton borrar;
    Barra barra;
    //Color def;
    
    public Mode(Barra barraAux){
        
        //def = editar.get;
        barra = barraAux;
        //this.setPreferredSize(new Dimension(300, 500));
        //this.setBackground(Color.MAGENTA);
                
        editar = new JButton("Modo editar");
        editar.setBackground(Color.GREEN);
        editar.setPreferredSize(new Dimension(50,50));
        //editar.setBounds(0, 0, 100, 100);        
        editar.setFocusable(false);
        //editar.addActionListener(this);          

        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
                editar.setBackground(Color.GREEN);
                borrar.setBackground(Color.gray);
                barra.getBorrar().setVisible(false);
                barra.getEditar().setVisible(true);
                System.out.println("Editar");
            }
        });
        //editar.setBounds(0, 0, 150, 30);
        barra.add(editar, BorderLayout.NORTH);
                        
        borrar = new JButton("Modo Borrar");
        borrar.setBackground(Color.gray);
        borrar.setPreferredSize(new Dimension(50,50));
        
        //borrar.setBounds(0, 0, 100, 100);
        //borrar.setText("Modo Borrar");
        borrar.setFocusable(false);
        //borrar.addActionListener(this);
        
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
                borrar.setBackground(Color.GREEN);
                editar.setBackground(Color.GRAY);
                barra.getBorrar().setVisible(true);
                barra.getEditar().setVisible(false);
                System.out.println("Borrar");
            }
        });
         
        barra.add(borrar, BorderLayout.SOUTH);
    }

   
}

