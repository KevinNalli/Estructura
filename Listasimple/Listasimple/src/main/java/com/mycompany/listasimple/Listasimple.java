/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-01
 */
public class Listasimple {
    Nodo inicio; 
    Listasimple(){
        inicio=null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo=new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            inicio=nuevo;      
        }else{       
            nuevo.setEnlace(inicio);
            inicio=nuevo;         
        }
    }   
    
    public void insertarFinal(String nombre, int edad, float promedio){
        Nodo nuevo=new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            inicio=nuevo;   
        }
        else{       
            Nodo temporal=inicio;       
            while(temporal.getEnlace()!=null){           
                temporal=temporal.getEnlace();

            }
             temporal.setEnlace(nuevo);     

         }
    }   
    
    public void insertarPorPosicion(String nombre, int edad, float promedio){
        Nodo nuevo=new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        int a = 1;
        int b = 1;
        int c = 1;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            inicio=nuevo;      
        }else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal=temporal.getEnlace();
                c++;
            }
            a = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quiere colocarlo? Hay "+c+" posiciones"));
            if(a>c || a<1){
                JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
            }else{
                temporal = inicio;
                while(b<(a-1)){
                    temporal=temporal.getEnlace();
                    b++;
                }
                Nodo temporal2;
                if(temporal.getEnlace()!=null){
                    temporal2=temporal.getEnlace();
                    temporal.setEnlace(nuevo);
                    temporal=temporal.getEnlace();
                    temporal.setEnlace(temporal2);
                }else{
                    temporal.setEnlace(nuevo);
                }
            }
        }
    }
    
    
    
    public void insertarPorDato(String nombre, int edad, float promedio){
        Nodo nuevo=new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        int a = 0;
        int b = 1;
        int c = 1;
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            inicio=nuevo;      
        }else{       
            Nodo temporal = inicio;
            
            String name = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
            while(temporal.getEnlace()!=null){
                System.out.println(temporal.getNombre().toLowerCase());
                System.out.println(name.toLowerCase());
                if(temporal.getNombre().toLowerCase().equals(name.toLowerCase())){
                    a = c;
                }
                temporal=temporal.getEnlace();
                c++;
            }
            
            if(a == 0){
                JOptionPane.showMessageDialog(null, "Nombre no encontrado");
            }
            
            if(a>c || a<1){
                JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
            }else{
                temporal = inicio;
                while(b<(a-1)){
                    temporal=temporal.getEnlace();
                    b++;
                }
                Nodo temporal2;
                if(temporal.getEnlace()!=null){
                    temporal2=temporal.getEnlace();
                    temporal.setEnlace(nuevo);
                    temporal=temporal.getEnlace();
                    temporal.setEnlace(temporal2);
                }else{
                    temporal.setEnlace(nuevo);
                }
            }        
        }
    }
    
    
    
    
    public void consultar(){    
        Nodo temporal=inicio;        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");       
        }else{     
            do{            
                JOptionPane.showMessageDialog(null,
                    "Nombre:  "+temporal.getNombre()+"\n"+
                    "LA EDAD ES :"+temporal.getEdad()+"\n"+
                    "EL PORMEDIO ES "+temporal.getPromedio()
                );
                temporal=temporal.getEnlace();    
            }while(temporal!=null);        
        }
    }
}
