
package pizarraproject;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Window extends JFrame implements ActionListener {
    private Pizarra pizarra;
    private Barra barra;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem delete;
    public Window() throws IOException{
        barra = new Barra();
        pizarra = new Pizarra();
  
        this.setLayout(new BorderLayout());
        
        this.setTitle("Pizarra Project");
        this.setSize(1300, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        
        ImageIcon image = new ImageIcon("Board.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(126, 114, 159));
        
        JMenuBar menu = new JMenuBar();
        
        JMenu Archivo = new JMenu("Archivo");
        
        load = new JMenuItem("Cargar");
        save = new JMenuItem("Guardar PDF");
        delete = new JMenuItem("Borrar Archivo");
        
        load.addActionListener(this);
        save.addActionListener(this);
        delete.addActionListener(this);
        
        Archivo.add(load);
        Archivo.add(save);
        Archivo.add(delete);
        
        menu.add(Archivo);
        
        this.setJMenuBar(menu);
        
        this.add(barra, BorderLayout.WEST);
        this.add(pizarra, BorderLayout.EAST);
        
        
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==load){
            System.out.println("Cargar");
        }
        if(e.getSource()==save){
            System.out.println("Guardar");
        }
        if(e.getSource()==load){
            System.out.println("Borrar");
        }
    }
}
