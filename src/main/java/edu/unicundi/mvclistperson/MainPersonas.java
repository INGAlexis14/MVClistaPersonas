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
 * @author Lorena NiÃ±o
 */
public class MainPersonas {
    
    public static void main(String[] args){
        
        ModelPersona model= new ModelPersona();
        ListaPersonas lista= new ListaPersonas();
        
       
        ControladorPersona crl= new ControladorPersona(lista, model) ;
        lista.setVisible(true);
    }
    
}


