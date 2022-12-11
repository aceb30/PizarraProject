
package pizarraproject;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class NewPizarra extends JFrame {
    private String name;
    private boolean close = false;
    public NewPizarra(JFrame frame, PizarraContainer cont){
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Inserte nombre");
        this.setPreferredSize(new Dimension(300, 100));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
       
        JButton submit = new JButton("Crear nueva pizarra");
        submit.setSize(50, 150);
        this.add(submit, BorderLayout.SOUTH);

        
        JTextField namer = new JTextField();
        namer.setSize(400, 300);
        this.add(namer, BorderLayout.CENTER);
        this.pack();
        
                
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name = namer.getText();
                try {
                    cont.getPestaña().AddPizarra(name);
                    close = true;
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(NewPizarra.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
        
        this.setVisible(true);
    }

    
    public String getName(){
        return name;
    }

}
