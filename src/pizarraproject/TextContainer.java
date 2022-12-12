
package pizarraproject;


import pizarraproject.drawable.*;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import pizarraproject.guicontrols.*;

public class TextContainer {
    private PizarraContainer contenedor;
    private ArrayList<DrawableText> cuadros;
    private int index;
    public TextContainer(PizarraContainer cont){
        contenedor = cont;
        cuadros = new ArrayList<DrawableText>();
        index = contenedor.getPestaña().getIndex();
        
    }
    
    public void addText(String texto, int x , int y, int index){
        DrawableText cuadro = new DrawableText(texto, x, y);
        cuadros.add(cuadro);
        Pizarra p = contenedor.getPestaña().getPizarra(index);
        p.add(cuadro);
    }
    
    public int getIndex(){
        return index;
    }
}
