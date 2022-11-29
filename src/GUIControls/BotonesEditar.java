
package GUIControls;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pizarraproject.*;

public class BotonesEditar {
    
    private JButton diagram;
    private JButton asoc;    
    private JButton comp;
    private JButton gene;
    private JButton depe;
    private JButton text;
    private Editar editar;
    
    public BotonesEditar(Editar b){
        
        editar = b;                                
                
        diagram = new JButton("Diagrama");
        diagram.setFocusable(false);
        diagram.setBounds(0, 0, 100, 100);
        diagram.setBackground(Color.LIGHT_GRAY);
        
        diagram.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Digram mode");
               diagram.setBackground(Color.GREEN);
               asoc.setBackground(Color.LIGHT_GRAY);
               comp.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        asoc = new JButton("Asociación");
        asoc.setFocusable(false);
        asoc.setBounds(100, 0, 100, 100);
        asoc.setBackground(Color.GREEN);
        
        asoc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Line mode");
               asoc.setBackground(Color.GREEN);
               diagram.setBackground(Color.LIGHT_GRAY);
               comp.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        
        comp = new JButton("Composición");
        comp.setFocusable(false);
        comp.setBounds(200, 0, 100, 100);
        comp.setBackground(Color.LIGHT_GRAY);
        
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Comps mode");
               comp.setBackground(Color.GREEN);
               asoc.setBackground(Color.LIGHT_GRAY);
               diagram.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        gene = new JButton("Generalización");
        gene.setFocusable(false);
        gene.setBounds(0, 100, 100, 100);
        gene.setBackground(Color.LIGHT_GRAY);
        
        gene.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Other mode");
               gene.setBackground(Color.GREEN);
               asoc.setBackground(Color.LIGHT_GRAY);
               diagram.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        depe = new JButton("Dependencia");
        depe.setFocusable(false);
        depe.setBounds(100,100, 100, 100);
        depe.setBackground(Color.LIGHT_GRAY);
        
        depe.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Other mode");
               depe.setBackground(Color.GREEN);
               asoc.setBackground(Color.LIGHT_GRAY);
               diagram.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        text = new JButton("Texto");
        text.setFocusable(false);
        text.setBounds(200, 100, 100, 100);
        text.setBackground(Color.LIGHT_GRAY);
        
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Other mode");
               text.setBackground(Color.GREEN);
               asoc.setBackground(Color.LIGHT_GRAY);
               diagram.setBackground(Color.LIGHT_GRAY);
            }
        });
        
        editar.add(asoc);
        editar.add(diagram);
        editar.add(comp);
        editar.add(gene);
        editar.add(depe);
        editar.add(text);        
    }
    
    public void setColor(){
        
        asoc.setBackground(Color.LIGHT_GRAY);
        diagram.setBackground(Color.LIGHT_GRAY);
    }
}

