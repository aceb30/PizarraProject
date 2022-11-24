
package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.*;

public class BotonesBorrar {
    private JButton prueba;
    private Borrar borrar;
    public BotonesBorrar(Borrar b){
        borrar = b;
        prueba = new JButton("Prueba 2");
        prueba.setFocusable(false);
        prueba.setBounds(0, 0, 100, 100);
        
        prueba.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Prueba 2");
            }
        });
        
        borrar.add(prueba);
    }
}
