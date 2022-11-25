
package GUIControls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MenuBar extends JMenuBar {
    
    private JMenuBar mb;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    private JMenu file;
    private JFrame wind;    
    
    public MenuBar(JFrame w){
        
        w.setLayout(null);
        
        //this.setPreferredSize(new Dimension(800, 20));        
        //this.setBackground(new Color(125, 206, 160));
        //this.setLocale(null);
        
        wind = w;
        mb = new JMenuBar();
        file = new JMenu("Opciones");
        load = new JMenuItem("Cargar");
        save = new JMenuItem("Guardar PDF");
        delete = new JMenuItem("Borrar Archivo");
        
        
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Cargar");
            }
        });
        
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Guardar");
            }
        });
         
         delete.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Borrar");
            }
        });
                  
        w.setJMenuBar(mb);
        
        mb.add(file);                
        
        file.add(load);
        file.add(save);
        file.add(delete);
        
        //wind.add(mb);
        //wind.add(bar,BorderLayout.NORTH);                
                
        //mb.setBackground(Color.red);                
        
        //this.add(bar,BorderLayout.NORTH);                
        
        
        
    }
}
