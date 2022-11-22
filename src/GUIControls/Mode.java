
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
    public Mode(Barra barraAux){
        barra = barraAux;
        editar = new JButton("Modo editar");
        //editar.setBounds(0, 0, 100, 100);
        //editar.setText("Modo editar ");
        editar.setFocusable(false);
        //editar.addActionListener(this);

         editar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               barra.getBorrar().setVisible(false);
               barra.getEditar().setVisible(true);
               System.out.println("Editar");
            }
        });
        
        barra.add(editar, BorderLayout.NORTH);
        
         
        borrar = new JButton("Modo Borrar");
        //borrar.setBounds(0, 0, 100, 100);
        //borrar.setText("Modo Borrar");
        borrar.setFocusable(false);
        //borrar.addActionListener(this);
        
         borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               barra.getBorrar().setVisible(true);
               barra.getEditar().setVisible(false);
               System.out.println("Borrar");
            }
        });
         
        barra.add(borrar, BorderLayout.SOUTH);
    }

   
}

