package pizarraproject;
import pizarraproject.guicontrols.Pestaña;
import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;
import pizarraproject.drawable.DrawableText;

/**
 *
 * @author nwroot
 */
public class PizarraContainer extends JPanel {
    private TextContainer textos;
    private Pestaña pestaña;

    /**
     * Creates a PizarraContainer
     * @throws IOException
     */

    public PizarraContainer() throws IOException{
        this.setLayout(new BorderLayout());
        pestaña = new Pestaña();
        textos = new TextContainer(this);
        this.add(pestaña, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    /**
     * Getter for pestana
     * @return pestana
     */
    public Pestaña getPestaña(){
        return pestaña;
    }
    public TextContainer getTextos(){
        return textos;
    }
}
