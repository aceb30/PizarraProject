
package pizarraproject.guicontrols;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.NewPizarra;
import pizarraproject.PizarraContainer;


public class MenuBar extends JMenuBar {
    
    private JMenuBar mb;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    private JMenu file;
    private JMenu addW;
    private JFrame wind;    
 
    public MenuBar(JFrame w, PizarraContainer cont){
        
        w.setLayout(null);
        
        //this.setPreferredSize(new Dimension(800, 20));        
        //this.setBackground(new Color(125, 206, 160));
        //this.setLocale(null);
        
        wind = w;
        mb = new JMenuBar();
        //file = new JMenu("Opciones");
        load = new JMenu("Cargar");
        save = new JMenu("Guardar PDF");
        delete = new JMenu("Borrar Archivo");
        
        addW = new JMenu("Nueva Pizarra");
        
        addW.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               NewPizarra nueva = new NewPizarra(w, cont);
               System.out.println("Nueva");
            }
        });
        
        
        
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
               int index = cont.getPestaña().getIndex();
               cont.getPestaña().DeletePizarra(index);
               System.out.println("Borrar");
            }
        });
                  
        w.setJMenuBar(mb);
        
        //mb.add(file);
        
        mb.add(addW);
        
        mb.add(load);
        mb.add(save);
        mb.add(delete);
        
        //wind.add(mb);
        //wind.add(bar,BorderLayout.NORTH);                
                
        //mb.setBackground(Color.red);                
        
        //this.add(bar,BorderLayout.NORTH);                
        
        
        
    }
}
