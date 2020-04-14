import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.ModelPersona;
import vista.ListaPersonas;

/**
 *
 * @author Lorena Niño
 */
public class ControllerPersona  implements ActionListener {
    
    private ListaPersonas listapersonas;
    private ModelPersona modelpersonas;
     DefaultListModel lista;
     
  
    
    
    public ControllerPersona (ListaPersonas listapersonas,ModelPersona modelpersonas){
        
        this.listapersonas= listapersonas;
        this.modelpersonas= modelpersonas;
        
        this.listapersonas.btnPersona.addActionListener(this);
        lista = new DefaultListModel();
        
        
    }
    
    
    public void  actionPerformed(ActionEvent e){
        
        // listapersonas.prueba.setText("sasas");
        // listapersonas.prueba.getText();
        
        
        modelpersonas.setPersona(listapersonas.TBPersona.getText());
       
        listapersonas.jListPersonas.setModel(lista);
        lista.addElement(modelpersonas.getPersona());
        
        
        
        
    }

   
   

    
}
