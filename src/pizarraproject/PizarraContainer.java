package pizarraproject;
import pizarraproject.guicontrols.Pestaña;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;
import pizarraproject.drawable.DrawableText;

public class PizarraContainer extends JPanel {
    
    private Pestaña pestaña;
    private TextContainer textos;
    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new Pestaña();
        textos = new TextContainer(this);
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public Pestaña getPestaña(){
        return pestaña;
    }
    public TextContainer getTextos(){
        return textos;
    }
}
