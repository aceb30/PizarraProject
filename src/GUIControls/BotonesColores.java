package GUIControls;
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
        blackButton.setBounds(0, 0, 100, 100);
        blackButton.setBackground(Color.BLACK);
        
        blackButton.setBorder(gBorder);
        
        blackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {               
                System.out.println("Black");               
                setColor();
                blackButton.setBorder(gBorder);             
            }
        });
        
        redButton = new JButton();
        redButton.setFocusable(false);
        redButton.setBounds(100,100,100,100);
        redButton.setBackground(Color.RED);                        
        
        redButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Red");
               setColor();
               redButton.setBorder(gBorder);               
            }
        });
        
        magentaButton = new JButton();
        magentaButton.setFocusable(false);
        magentaButton.setBounds(100, 0, 100, 100);
        magentaButton.setBackground(Color.MAGENTA);
        
        magentaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Magneta");
               setColor();
               magentaButton.setBorder(gBorder);              
            }
        });
        
        
        yellowButton = new JButton();
        yellowButton.setFocusable(false);
        yellowButton.setBounds(200, 0, 100, 100);
        yellowButton.setBackground(Color.YELLOW);
        
        yellowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Yellow");
               setColor();
               yellowButton.setBorder(gBorder);             
            }
        });
        
        grayButton = new JButton();
        grayButton.setFocusable(false);
        grayButton.setBounds(0, 100, 100, 100);
        grayButton.setBackground(Color.GRAY);
        
        grayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Gray");
               setColor();
               grayButton.setBorder(gBorder);               
            }
        });                
        
        orangeButton = new JButton();
        orangeButton.setFocusable(false);
        orangeButton.setBounds(200, 100, 100, 100);
        orangeButton.setBackground(Color.ORANGE);
        
        orangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               System.out.println("Orange");
               setColor();
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
    
    public void setColor(){
        
        redButton.setBorder(lBorder);
        magentaButton.setBorder(lBorder);
        yellowButton.setBorder(lBorder);
        blackButton.setBorder(lBorder);
        orangeButton.setBorder(lBorder);
        grayButton.setBorder(lBorder);
        
    }
    
    

    
}
