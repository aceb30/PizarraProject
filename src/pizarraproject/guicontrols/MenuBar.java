package pizarraproject.guicontrols;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import pizarraproject.ImageSaver;
import pizarraproject.NewPizarra;
import pizarraproject.Pizarra;
import pizarraproject.PizarraContainer;

/**
 *
 * @author nwroot
 */
public class MenuBar extends JMenuBar {
    
    private JMenuBar mb;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    private JMenu file;
    private JMenu addW;
    private JFrame wind;    
 
    /**
     * Create a MenuBar
     * @param w Parent frame
     * @param cont Parent PizarraContainer
     */
    public MenuBar(JFrame w, PizarraContainer cont){
        
        w.setLayout(null);
        
        //this.setPreferredSize(new Dimension(800, 20));        
        //this.setBackground(new Color(125, 206, 160));
        //this.setLocale(null);
        
        wind = w;
        mb = new JMenuBar();
        //file = new JMenu("Opciones");
        load = new JMenu("Cargar");
        save = new JMenu("Guardar como imagen");
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
               int index = cont.getPestaña().getIndex();
               Pizarra curr_pizarra = cont.getPestaña().getPizarra(index);
               ImageSaver saver = new ImageSaver(curr_pizarra);
                try {
                    BufferedImage image = saver.printScreen(curr_pizarra);
                    saver.save(image);
                } catch (AWTException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MenuBar.class.getName()).log(Level.SEVERE, null, ex);
                }
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

        mb.add(addW);
        
        mb.add(load);
        mb.add(save);
        mb.add(delete);
        
    }
}
