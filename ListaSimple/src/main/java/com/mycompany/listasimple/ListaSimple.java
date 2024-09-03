/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-10
 */
public class ListaSimple {
    
    Nodo inicio;
    
    ListaSimple(){
        inicio= null;
    }

    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        }else{
            nuevo.setEnlace(inicio);
            inicio= nuevo;
        }
    }
    public void consultar(){
        Nodo temporal = inicio;
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else{
            do{
                
               JOptionPane.showMessageDialog(null, 
                       "Nombre: "+ temporal.getNombre()+"\n" +
                       "Edad: "+ temporal.getEdad()+"\n" +
                       "Promedio: "+ temporal.getPromedio()
               ); 
               
            }while(temporal.getEnlace()!= null);
        }
    }
}
