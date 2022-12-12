
package pizarraproject;

import pizarraproject.drawable.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import pizarraproject.guicontrols.*;


public class NewText extends JFrame{
    private String contenido;
    private boolean close = false;
    public NewText(PizarraContainer cont){
        this.setTitle("Inserte Texto");
        this.setPreferredSize(new Dimension(300, 100));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        
        JButton submit = new JButton("Añadir Cuadro de Texto");
        submit.setSize(50, 150);
        this.add(submit, BorderLayout.SOUTH);
        
        JTextField namer = new JTextField();
        namer.setSize(400, 300);
        this.add(namer, BorderLayout.CENTER);
        this.pack();
        
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                 contenido = namer.getText();
                 int index = cont.getTextos().getIndex();
                 int x = evt.getX();
                 int y = evt.getY();
                 cont.getTextos().addText(contenido, x, y, index);
                 close = true;
                 dispose();
            }
        });
        
        this.setVisible(true);
        
    }
    
    public String getText(){
        return contenido;
    }
}
