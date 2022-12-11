package pizarraproject.guicontrols;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import pizarraproject.*;

public class BotonesBorrar extends JPanel{
    
    private JButton object;    
    private JButton all;
    private Borrar borrar;
    
    public BotonesBorrar(Borrar b){
        
        borrar = b;                
        
        object = new JButton();
        object.setFocusable(false);
        object.setBounds(10,10,50, 50);
        object.setBackground(Color.GREEN);
        ImageIcon objIcon = new ImageIcon("obj.png");
        object.setIcon(objIcon);
        
        object.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Object");
               setColor();
               object.setBackground(Color.GREEN);               
            }
        });        
        
        all = new JButton();
        all.setFocusable(false);
        all.setBounds(65, 10, 50, 50);
        all.setBackground(Color.GRAY);
        ImageIcon allIcon = new ImageIcon("all.png");
        all.setIcon(allIcon);
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("All");
               setColor();
               all.setBackground(Color.GREEN);    
               Pestaña.clear();
            }
        });
        
        borrar.add(object);        
        borrar.add(all);
    }
    
    public void setColor(){
    
        all.setBackground(Color.GRAY);
        object.setBackground(Color.GRAY);        
        
    }
}
