package pizarraproject.guicontrols;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import pizarraproject.*;

public class BotonesColores extends JPanel{

    private JButton redButton;
    private JButton magentaButton;
    private JButton yellowButton;
    private JButton grayButton;
    private JButton blackButton;
    private JButton orangeButton;

    private Colores color;
    private LineBorder gBorder;
    private LineBorder lBorder;
    
    public BotonesColores(Colores c){
        
        color = c;        
        
        gBorder = new LineBorder(Color.GREEN);
        lBorder =  new LineBorder(Color.LIGHT_GRAY);
        
        blackButton = new JButton();
        blackButton.setFocusable(false);
        blackButton.setBounds(35,15,30,30);
        blackButton.setBackground(Color.BLACK);
        
        blackButton.setBorder(gBorder);
        
        blackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {               
                System.out.println("Black");               
                cleanColor();
                blackButton.setBorder(gBorder);                   
            }
        });
        
        redButton = new JButton();
        redButton.setFocusable(false);
        redButton.setBounds(75,15,30,30);
        redButton.setBackground(Color.RED);                        
        
        redButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Red");
               cleanColor();
               redButton.setBorder(gBorder);               
            }
        });
        
        magentaButton = new JButton();
        magentaButton.setFocusable(false);
        magentaButton.setBounds(115, 15, 30, 30);
        magentaButton.setBackground(Color.MAGENTA);
        
        magentaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Magneta");
               cleanColor();
               magentaButton.setBorder(gBorder);              
            }
        });
        
        
        yellowButton = new JButton();
        yellowButton.setFocusable(false);
        yellowButton.setBounds(35,55,30,30);
        yellowButton.setBackground(Color.YELLOW);
        
        yellowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Yellow");
               cleanColor();
               yellowButton.setBorder(gBorder);             
            }
        });
        
        grayButton = new JButton();
        grayButton.setFocusable(false);
        grayButton.setBounds(75, 55, 30, 30);
        grayButton.setBackground(Color.GRAY);
        
        grayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Gray");
               cleanColor();
               grayButton.setBorder(gBorder);               
            }
        });                
        
        orangeButton = new JButton();
        orangeButton.setFocusable(false);
        orangeButton.setBounds(115, 55, 30, 30);
        orangeButton.setBackground(Color.ORANGE);
        
        orangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Orange");
               cleanColor();
               orangeButton.setBorder(gBorder);               
            }
        });
        
        color.add(blackButton);
        color.add(redButton);
        color.add(grayButton);
        color.add(magentaButton);
        color.add(yellowButton);       
        color.add(orangeButton); 
        
    }
    
    public void cleanColor(){
        
        redButton.setBorder(lBorder);
        magentaButton.setBorder(lBorder);
        yellowButton.setBorder(lBorder);
        blackButton.setBorder(lBorder);
        orangeButton.setBorder(lBorder);
        grayButton.setBorder(lBorder);
        
    }
    
    

    
}
