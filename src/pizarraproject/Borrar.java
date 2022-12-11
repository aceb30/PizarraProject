package pizarraproject;

import pizarraproject.guicontrols.BotonesBorrar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Borrar extends JPanel{
    
    BotonesBorrar botones;
    
    public Borrar(){
        
        this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.RED);
        
        this.setLayout(null);        

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
