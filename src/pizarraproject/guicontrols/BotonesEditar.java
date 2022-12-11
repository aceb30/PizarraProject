
package pizarraproject.guicontrols;
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
    private JButton penc;
    private Editar editar;
    
    public BotonesEditar(Editar b, PizarraContainer p){
        
        editar = b;                                
                
        diagram = new JButton();
        diagram.setFocusable(false);
        diagram.setBounds(10, 10,50, 50);
        diagram.setBackground(Color.GREEN);
        ImageIcon diagIcon = new ImageIcon("diag.png");
        diagram.setIcon(diagIcon);
        
        diagram.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Digram mode");
               setColor();
               diagram.setBackground(Color.GREEN);               
            }
        });
        
        asoc = new JButton();
        asoc.setFocusable(false);
        asoc.setBounds(65, 10, 50, 50);
        asoc.setBackground(Color.LIGHT_GRAY);
        ImageIcon asocIcon = new ImageIcon("Asso.png");
        asoc.setIcon(asocIcon);
        
        asoc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Asso mode");
               setColor();
               asoc.setBackground(Color.GREEN);               
            }
        });
        
        
        comp = new JButton();
        comp.setFocusable(false);
        comp.setBounds(120,10,50,50);
        comp.setBackground(Color.LIGHT_GRAY);
        ImageIcon compIcon = new ImageIcon("Comp.png");
        comp.setIcon(compIcon);
        
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Composition mode");
               setColor();
               comp.setBackground(Color.GREEN);               
            }
        });
        
        gene = new JButton();
        gene.setFocusable(false);
        gene.setBounds(10,70,50,50);
        gene.setBackground(Color.LIGHT_GRAY);
        ImageIcon geneIcon = new ImageIcon("gene.png");
        gene.setIcon(geneIcon);
        
        gene.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Generelization mode");
               setColor();
               gene.setBackground(Color.GREEN);               
            }
        });
        
        depe = new JButton();
        depe.setFocusable(false);
        depe.setBounds(65,70,50,50);
        depe.setBackground(Color.LIGHT_GRAY);
        ImageIcon depeIcon = new ImageIcon("depe.png");
        depe.setIcon(depeIcon);
        
        depe.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {               
                System.out.println("Depende mode");               
                setColor();
                depe.setBackground(Color.GREEN);               
            }
        });
        
        text = new JButton();
        text.setFocusable(false);
        text.setBounds(120,70,50,50);
        text.setBackground(Color.LIGHT_GRAY);
        ImageIcon TIcon = new ImageIcon("text.png");
        text.setIcon(TIcon);
        
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Text mode");
               setColor();
               text.setBackground(Color.GREEN);               
            }
        });
        
        penc = new JButton();
        penc.setFocusable(false);
        penc.setBounds(120,70,50,50);
        penc.setBackground(Color.LIGHT_GRAY);
        ImageIcon pencIcon = new ImageIcon("penc.png");
        penc.setIcon(TIcon);
        
        penc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Text mode");
               setColor();
               penc.setBackground(Color.GREEN);               
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
        comp.setBackground(Color.LIGHT_GRAY);
        depe.setBackground(Color.LIGHT_GRAY);
        gene.setBackground(Color.LIGHT_GRAY);
        text.setBackground(Color.LIGHT_GRAY);
        
    }
}

