
package pizarraproject;

import GUIControls.BotonesEditar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Editar extends JPanel {
    
    JButton prueba;
    BotonesEditar botones;
    
    public Editar(){
        this.setLocale(null);
        this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 500));
        this.setBackground(new Color(77, 144, 232));
        
        this.setLayout(null);
        botones = new BotonesEditar(this);
        this.revalidate();
        this.repaint();
    }
    
 
    
}
