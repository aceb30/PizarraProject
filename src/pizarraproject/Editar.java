
package pizarraproject;

import pizarraproject.guicontrols.BotonesEditar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Editar extends JPanel {
    
    JButton prueba;
    BotonesEditar botones;
    
    public Editar(PizarraContainer p){
        
        this.setLocale(null);
        this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300,300));
        this.setBackground(Color.BLUE);
        
        this.setLayout(null);
        botones = new BotonesEditar(this, p);
        this.revalidate();
        this.repaint();
    }
    
 
    
}
