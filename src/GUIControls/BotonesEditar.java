
package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.*;

public class BotonesEditar {
    private JButton prueba;
    private Editar editar;
    public BotonesEditar(Editar b){
        editar = b;
        prueba = new JButton("Prueba 1");
        prueba.setFocusable(false);
        prueba.setBounds(0, 0, 100, 100);
        
        prueba.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Prueba 1");
            }
        });
        
        editar.add(prueba);
    }
}

