/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.mvclistperson;

import modelo.ModelPersona;
import vista.ListaPersonas;

import controlador.ControladorPersona;
        
/**
 *
 * @author Alexis Gonzalez
 
 */
public class MainPersonas {
    
    public static void main(String[] args){
        /*
        * se instancía el objeto de cada clase y se pasa por parametro al controlador cada objeto
        
        */
        ModelPersona model= new ModelPersona();
        ListaPersonas lista= new ListaPersonas();
        
       
        ControladorPersona crl= new ControladorPersona(lista, model) ;
        lista.setVisible(true);
    }
    
}


