/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo_en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-09
 */
public class Trabajo_En_Clase{
    Person inicio;
    
    public void Trabajo_En_Clase(){
        inicio = null;
    }
    
    public void insertarFinal(int edad, String name){
        Person temporal = inicio;
        Person nuevo = new Person();
        nuevo.setEdad(edad);
        nuevo.setNombre(name);
        nuevo.setAdelante(null);
        nuevo.setAtras(null);
        
        if(inicio != null){
            while(temporal.getAdelante()!=null){
                temporal = temporal.getAdelante();
            }
            temporal.setAdelante(nuevo);
            nuevo.setAtras(temporal);
        }else{
            inicio = nuevo;
        }
        
    }
    public void imprimir(){
        Person temporal = inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie");
        }else{
            while(temporal!= null){
                JOptionPane.showMessageDialog(null, "Nombre: "+ temporal.getNombre()+"\n Edad: "+ temporal.getEdad());
                temporal = temporal.getAdelante();
            }
        }
    }
    public void borrarmenores(){
        Person temporal = inicio;
        while(temporal!=null){
            if(temporal.getEdad()<18){
                if(temporal.getAtras()==null){
                    inicio=temporal.getAdelante();
                }
                if(temporal.getAtras()!=null){
                    temporal.getAtras().setAdelante(temporal.getAdelante());    
                }
                if(temporal.getAdelante()!= null){
                    temporal.getAdelante().setAtras(temporal.getAtras());
                }
                if(temporal.getAtras()==null &&  temporal.getAdelante()==null){
                    inicio = null;
                }
                
            }
            temporal = temporal.getAdelante();
        }
    }
    
    
    public void buscarmayores(){
        int c = 0;
        Person temporal = inicio;
        while(temporal!=null){
            c++;
            if(temporal.getEdad()>=18){
                JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getNombre() + " en la posicion: "+c);
            }
            temporal = temporal.getAdelante();
        }
    }
    public void buscarPosicion(){
        int n = 1;
        int a = 1;
        Person temporal = inicio;
        while(temporal.getAdelante()!=null){
            temporal = temporal.getAdelante();
            a++;
        }
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Posicion, hay "+ a+ " posiciones"));
        temporal = inicio;
        if(c>a){
            JOptionPane.showMessageDialog(null, "No existe tal posición");
        }else{
            while(temporal!=null){
                if(n==c){
                    if(temporal.getAtras()==null && temporal.getAdelante()==null){
                        JOptionPane.showMessageDialog(null, "No existe nadie adelante o atras");
                    }else if(temporal.getAtras()==null){
                        JOptionPane.showMessageDialog(null, "No existe nadie atras la persona adelante es: "+temporal.getAdelante().getNombre());
                    }else if(temporal.getAdelante()==null){
                        JOptionPane.showMessageDialog(null, "No existe nadie adelante la persona atras es: "+temporal.getAtras().getNombre());
                    }else{
                        JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getNombre() + " en la posicion: "+c +"\n"+
                            "Persona adelante: "+temporal.getAtras().getNombre() 
                            + "\n Persona atras: " + temporal.getNombre()
                    );
                    }}
                n++;
                temporal = temporal.getAdelante();
            }
        }
    }
}
