
package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.*;

public class BotonesBorrar {
    
    private JButton object;
    private JButton select;
    private JButton all;
    private Borrar borrar;
    
    public BotonesBorrar(Borrar b){
        
        borrar = b;
        
        object = new JButton("Objeto");
        object.setFocusable(false);
        object.setBounds(0, 0, 100, 100);
        object.setBackground(Color.LIGHT_GRAY);
        
        object.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Object");
               object.setBackground(Color.GREEN);
               select.setBackground(Color.LIGHT_GRAY);
               all.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        select = new JButton("Selección");
        select.setFocusable(false);
        select.setBounds(100, 0, 100, 100);
        select.setBackground(Color.LIGHT_GRAY);
        
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Select");
               select.setBackground(Color.GREEN);
               object.setBackground(Color.LIGHT_GRAY);
               all.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        all = new JButton("Todo");
        all.setFocusable(false);
        all.setBounds(200, 0, 100, 100);
        all.setBackground(Color.LIGHT_GRAY);
        
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("All");
               all.setBackground(Color.GREEN);
               object.setBackground(Color.LIGHT_GRAY);
               select.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        borrar.add(object);
        borrar.add(select);
        borrar.add(all);
    }
}
