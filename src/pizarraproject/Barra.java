
package pizarraproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class Barra extends JPanel implements ActionListener{
    JButton editar;
    JButton borrar;
    public Barra(){
        this.setPreferredSize(new Dimension(300, 650));
        this.setBackground(new Color(93, 142, 113));
        
        editar = new JButton();
        editar.setBounds(0, 0, 100, 100);
        editar.setText("Modo editar ");
        editar.setFocusable(false);
        editar.addActionListener(this);
        this.add(editar);
        
        borrar = new JButton();
        borrar.setBounds(0, 0, 100, 100);
        borrar.setText("Modo Borrar");
        borrar.setFocusable(false);
        borrar.addActionListener(this);
        this.add(borrar);
        
        this.revalidate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==editar){
            System.out.println("Modo Editar");
        }
        if(e.getSource()==borrar){
            System.out.println("Modo Borrar");
        }
    }
}