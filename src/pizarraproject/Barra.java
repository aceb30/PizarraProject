
package pizarraproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class Barra extends JPanel implements ActionListener{
    JButton editar;
    JButton borrar;
    Editar barraEditar;
    Borrar barraBorrar;
    //GridBagConstraints gbc;
    public Barra(){
        
        this.setLayout(new BorderLayout());
        //this.setLayout(new GridBagLayout());
        //gbc = new GridBagConstraints();
       
        
        this.setPreferredSize(new Dimension(300, 650));
        this.setBackground(new Color(93, 142, 113));
        
        barraEditar = new Editar();
        barraBorrar = new Borrar();
        
        barraEditar.setVisible(true);
        barraBorrar.setVisible(false);
        
        this.add(barraEditar, BorderLayout.EAST);
        this.add(barraBorrar, BorderLayout.WEST);
        
        editar = new JButton("Modo editar");
        //editar.setBounds(0, 0, 100, 100);
        //editar.setText("Modo editar ");
        editar.setFocusable(false);
        editar.addActionListener(this);
        this.add(editar, BorderLayout.NORTH);
        
        borrar = new JButton("Modo Borrar");
        //borrar.setBounds(0, 0, 100, 100);
        //borrar.setText("Modo Borrar");
        borrar.setFocusable(false);
        borrar.addActionListener(this);
        this.add(borrar, BorderLayout.SOUTH);
        
        
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
}