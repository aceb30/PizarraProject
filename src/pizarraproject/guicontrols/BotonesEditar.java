
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
    private JButton move;
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
               Pizarra.setMode(1);
            }
        });
        
        asoc = new JButton();
        asoc.setFocusable(false);
        asoc.setBounds(65, 10, 50, 50);
        asoc.setBackground(Color.GRAY);
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
        comp.setBackground(Color.GRAY);
        ImageIcon compIcon = new ImageIcon("Comp.png");
        comp.setIcon(compIcon);
        
        comp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Composition mode");
               setColor();
               comp.setBackground(Color.GREEN); 
               Pizarra.remove();
            }
        });
        
        gene = new JButton();
        gene.setFocusable(false);
        gene.setBounds(10,70,50,50);
        gene.setBackground(Color.GRAY);
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
        depe.setBackground(Color.GRAY);
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
        text.setBackground(Color.GRAY);
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
        penc.setBounds(10,130,50,50);
        penc.setBackground(Color.GRAY);
        ImageIcon pencIcon = new ImageIcon("penc.png");
        penc.setIcon(pencIcon);
        
        penc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Pencil mode");
               setColor();
               penc.setBackground(Color.GREEN); 
               Pizarra.setMode(2);
            }
        });
        
        move = new JButton();
        move.setFocusable(false);
        move.setBounds(65,130,50,50);
        move.setBackground(Color.GRAY);
        ImageIcon moveIcon = new ImageIcon("move.png");
        move.setIcon(moveIcon);
        
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Move mode");
               setColor();
               move.setBackground(Color.GREEN);               
            }
        });
        
        editar.add(asoc);
        editar.add(diagram);
        editar.add(comp);
        editar.add(gene);
        editar.add(depe);
        editar.add(text); 
        editar.add(penc);
        editar.add(move);
    }
    
    public void setColor(){
        
        asoc.setBackground(Color.GRAY);
        diagram.setBackground(Color.GRAY);
        comp.setBackground(Color.GRAY);
        depe.setBackground(Color.GRAY);
        gene.setBackground(Color.GRAY);
        text.setBackground(Color.GRAY);
        penc.setBackground(Color.GRAY);
        move.setBackground(Color.GRAY);
        
    }
}

