
package pizarraproject.guicontrols;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JButton;
import pizarraproject.*;

/**
 *
 * @author nwroot
 */
public class Mode extends JButton{
    
    JButton editar;
    JButton borrar;
    Barra barra;
    JPanel auxPanel;
    JPanel sPanel;
    
    /**
     * Create a Mode
     * @param barraAux
     */
    public Mode(Barra barraAux){
        barra = barraAux;
        
        auxPanel = new JPanel();
        sPanel = new JPanel();
        
        auxPanel.setPreferredSize(new Dimension(300,10));
        auxPanel.setBackground(Color.LIGHT_GRAY);
        barra.add(auxPanel,BorderLayout.NORTH);
        
        sPanel.setPreferredSize(new Dimension(300,10));
        sPanel.setBackground(Color.LIGHT_GRAY);
        
                
        editar = new JButton("Editar");
        editar.setBackground(Color.GREEN);
        editar.setPreferredSize(new Dimension(80,40));     
        editar.setFocusable(false);

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
        
        barra.add(editar, BorderLayout.WEST);
                        
        borrar = new JButton("Borrar");
        borrar.setBackground(Color.gray);
        borrar.setPreferredSize(new Dimension(80,40));

        borrar.setFocusable(false);

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
         
        barra.add(borrar, BorderLayout.EAST);
        
        barra.add(sPanel,BorderLayout.SOUTH);
    }

   
}

