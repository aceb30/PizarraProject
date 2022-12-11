package pizarraproject;
import GUIControls.*;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

public class PizarraContainer extends JPanel {
    private Pestaña pestaña;
    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new Pestaña();
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public Pestaña getPestaña(){
        return pestaña;
    }
}
