package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.ModelPersona;
import vista.ListaPersonas;


/**
 *
 * @author Alexis Gonzalez
 */
public class   ControladorPersona  implements ActionListener {
    /**
     * instancia de clases
     */
    private ListaPersonas listapersonas;
    private ModelPersona modelpersonas;
    DefaultListModel lista;
     
  
    /**
     * 
     * @param listapersonas
     * @param modelpersonas 
     */
    
    /*
    * contructor de la clase controlador personas,resive 2 parametros el pojo y la vista 
    */
    public ControladorPersona (ListaPersonas listapersonas,ModelPersona modelpersonas){
        
        this.listapersonas= listapersonas;
        this.modelpersonas= modelpersonas;
        
        this.listapersonas.btnPersona.addActionListener(this);
        lista = new DefaultListModel();
        
        
    }
    /**
     * 
     * @param e 
     * creación evento del botón la cual extiende de la clase action listener
     * se llama la clase pojo para retornar el valor que digita el usuario por medio de los metodos set y get
     * se llama al metodo addelement y se pasa por parametro a la vista el getPersona
     */
    
    public void  actionPerformed(ActionEvent e){
        
        // listapersonas.prueba.setText("sasas");
        // listapersonas.prueba.getText();
        
        
        modelpersonas.setPersona(listapersonas.TBPersona.getText());
       
        listapersonas.jListPersonas.setModel(lista);
        lista.addElement(modelpersonas.getPersona());
        
        
        
        
    }

   
   

    
}
