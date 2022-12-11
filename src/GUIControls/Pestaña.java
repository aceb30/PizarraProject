
package GUIControls;
import java.io.IOException;
import pizarraproject.*;
import javax.swing.*;
import java.util.*;

public class Pestaña extends JTabbedPane{
    private ArrayList<Pizarra> pizarras;
    private ArrayList<String> names;
    public Pestaña() throws IOException{
        pizarras = new ArrayList<Pizarra>();
        names = new ArrayList<String>();
        AddPizarra("Pizarra Nueva");
        
    }
    public void AddPizarra(String name) throws IOException{
        Pizarra aux = new Pizarra();
        pizarras.add(aux);
        names.add(name);
        this.add(names.get(names.size()-1), pizarras.get( pizarras.size()-1));
    }
    
    public void DeletePizarra(){
        
    }
}
