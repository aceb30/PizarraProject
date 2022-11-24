
package pizarraproject;

import GUIControls.BotonesBorrar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Borrar extends JPanel{
    BotonesBorrar botones;
    JButton prueba;
    public Borrar(){
        
        this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 500));
        this.setBackground(new Color(215, 68, 68));
        
        this.setLayout(null);
        
        /*
        prueba = new JButton();
        prueba.setBounds(0, 0, 100, 100);
        prueba.setText("Prueba2 ");
        prueba.setFocusable(false);
        prueba.addActionListener(this);
        this.add(prueba);
        */

        botones = new BotonesBorrar(this);
        
        this.revalidate();
        this.repaint();
    }
      
   /*
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==prueba){
            System.out.println("Prueba");
        }
    }
*/
    
}
