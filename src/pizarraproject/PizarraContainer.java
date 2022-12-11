package pizarraproject;
import pizarraproject.guicontrols.PizarraMananger;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

public class PizarraContainer extends JPanel {
    private PizarraMananger pestaña;
    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new PizarraMananger();
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public PizarraMananger getPestaña(){
        return pestaña;
    }
}
