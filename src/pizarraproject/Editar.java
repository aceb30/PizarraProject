
package pizarraproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class Editar extends JPanel implements ActionListener {
    JButton prueba;
    public Editar(){
        //this.setBounds(50, 20, 100, 100);
        this.setPreferredSize(new Dimension(300, 500));
        this.setBackground(new Color(77, 144, 232));
        
        prueba = new JButton();
        prueba.setBounds(0, 0, 100, 100);
        prueba.setText("Prueba1 ");
        prueba.setFocusable(false);
        prueba.addActionListener(this);
        this.add(prueba);
        
        this.revalidate();
        this.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==prueba){
            System.out.println("Prueba");
        }
    }
    
}
