package pizarraproject.guicontrols;
import java.io.IOException;
import pizarraproject.*;
import javax.swing.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Pestaña extends JTabbedPane{
    
    private static ArrayList<Pizarra> pizarras;
    private ArrayList<String> names;
    public static int index;
    private static Pizarra auxP;
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
    
    public Pizarra getPizarra(int i){
        return pizarras.get(i);                
    }
    
    public static void undo(){        
        auxP = pizarras.get(index);
        auxP.remove(); 
    }
    
    public static void redo(){        
        auxP = pizarras.get(index);
        auxP.restore();
    }
    
    public static void clear(){
        auxP = pizarras.get(index);
        auxP.clear();
    }
    
  ChangeListener changeListener = new ChangeListener() {
        public void stateChanged(ChangeEvent changeEvent) {
        JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
        index = sourceTabbedPane.getSelectedIndex();
        System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
      }
    };
    
    
}
