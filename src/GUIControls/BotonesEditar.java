
package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.*;

public class BotonesEditar {
    
    private JButton line;
    private JButton diagram;
    private JButton other;
    private Editar editar;
    
    public BotonesEditar(Editar b){
        
        editar = b;                                
        
        line = new JButton("Linea");
        line.setFocusable(false);
        line.setBounds(0, 0, 100, 100);
        line.setBackground(Color.GREEN);
        
        line.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Line mode");
               line.setBackground(Color.GREEN);
               diagram.setBackground(Color.LIGHT_GRAY);
               other.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        diagram = new JButton("Diagrama");
        diagram.setFocusable(false);
        diagram.setBounds(100, 0, 100, 100);
        diagram.setBackground(Color.LIGHT_GRAY);
        
        diagram.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Digram mode");
               diagram.setBackground(Color.GREEN);
               line.setBackground(Color.LIGHT_GRAY);
               other.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        other = new JButton("Otro");
        other.setFocusable(false);
        other.setBounds(200, 0, 100, 100);
        other.setBackground(Color.LIGHT_GRAY);
        
        other.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Other mode");
               other.setBackground(Color.GREEN);
               line.setBackground(Color.LIGHT_GRAY);
               diagram.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        editar.add(line);
        editar.add(diagram);
        editar.add(other);
    }
}

