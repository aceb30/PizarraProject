
package GUIControls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MenuBar extends JMenuBar {
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    private JMenu archivo;
    private JFrame wind;
    private JMenuBar bar;
    
    public MenuBar(JFrame w){
        
        this.setPreferredSize(new Dimension(800, 20));        
        this.setBackground(new Color(125, 206, 160));
        this.setLocale(null);
        
        wind = w;
        bar = new JMenuBar();
        archivo = new JMenu();
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
                  
        archivo.add(load);
        archivo.add(save);
        archivo.add(delete);
        
        bar.add(archivo);
        bar.setBackground(Color.red);
        
        //bar.setBounds(0, 0, 1300, 80);
        
        this.add(bar,BorderLayout.NORTH);
        
        wind.setJMenuBar(bar);
        
        wind.add(bar,BorderLayout.NORTH);
        
    }
}
