
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
    public MenuBar(){
        
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
        
        this.add(archivo);
        
        this.setVisible(true); 
    }
}
