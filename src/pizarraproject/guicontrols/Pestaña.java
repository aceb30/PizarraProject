
package pizarraproject.guicontrols;
import java.io.IOException;
import pizarraproject.*;
import javax.swing.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Pestaña extends JTabbedPane{
    private ArrayList<Pizarra> pizarras;
    private ArrayList<String> names;
    private int index;
    public Pestaña() throws IOException{
        pizarras = new ArrayList<Pizarra>();
        names = new ArrayList<String>();
        AddPizarra("Pizarra Nueva");
        this.addChangeListener(changeListener);
    }
    public void AddPizarra(String name) throws IOException{
        Pizarra aux = new Pizarra();
        pizarras.add(aux);
        names.add(name);
        this.add(names.get(names.size()-1), pizarras.get( pizarras.size()-1));
    }
    
    public void DeletePizarra(int ind){
        this.remove(ind);
        pizarras.remove(ind);
        names.remove(ind);
    }
    
    public int getIndex(){
        return index;
    }
    
  ChangeListener changeListener = new ChangeListener() {
      public void stateChanged(ChangeEvent changeEvent) {
        JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
        index = sourceTabbedPane.getSelectedIndex();
        System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
      }
    };
    
    
}
