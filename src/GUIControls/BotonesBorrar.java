package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import pizarraproject.*;

public class BotonesBorrar extends JPanel{
    
    private JButton object;
    private JButton select;
    private JButton all;
    private Borrar borrar;
    
    public BotonesBorrar(Borrar b){
        
        borrar = b;
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        object = new JButton("Objeto");
        object.setFocusable(false);
        object.setBounds(0, 0, 100, 100);
        object.setBackground(Color.GREEN);
        
        object.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Object");
               setColor();
               object.setBackground(Color.cyan);
               object.setBorder(new LineBorder(Color.GREEN));
               add(object, gbc);
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
               setColor();
               select.setBackground(Color.GREEN);
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
               setColor();
               all.setBackground(Color.GREEN);               
            }
        });
        
        borrar.add(object);
        borrar.add(select);
        borrar.add(all);
    }
    
    public void setColor(){
    
        all.setBackground(Color.LIGHT_GRAY);
        object.setBackground(Color.LIGHT_GRAY);
        select.setBackground(Color.LIGHT_GRAY);
        
    }
}
