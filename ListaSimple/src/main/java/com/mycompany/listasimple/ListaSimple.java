
package com.mycompany.listasimple;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ListaSimple {
    
    Nodo inicio;
    Nodo ordenar;
    
    ListaSimple(){
        inicio=null;
        ordenar=null;
    }
    
    public void insertarInicio(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            nuevo.setEnlace(inicio);
            inicio=nuevo;
        }
    }
    
    public void insertarFinal(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal=temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    
    public void eliminarPosicion(){
        int a=1;
        int b=1;
        int c=1;
        Nodo temporal = inicio;
        while(temporal.getEnlace()!=null){
            temporal=temporal.getEnlace();
            c++;
        }
        a = Integer.parseInt(JOptionPane.showInputDialog("¿Qué posición quiere eliminar? Hay "+c+" posiciones"));
        if(a>c || a<1){
            JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
        }else{
            temporal = inicio;
            while(b<(a-1)){
                temporal=temporal.getEnlace();
                b++;
            }
            if(a==1){
                if(temporal!=null){
                    if(inicio.getEnlace()!=null){
                        inicio=inicio.getEnlace();
                    }else{
                        inicio=null;
                        JOptionPane.showMessageDialog(null, "Ha borrado todos los registros");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No hay nada para borrar");
                }
            }else{
                temporal.setEnlace(temporal.getEnlace().getEnlace());
            }
        }
    }
    
    public void create(){
        String[] abecedario={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","u","v","w","x","y","z"};
        String abecedarios = "abcdefghijklmnopqrstuvwxyz";
        int nods = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes "));
        long tiempoInicio = System.currentTimeMillis();
        String name = "";
        float prom = 0;
        for(int i = 0; i<nods; i++){
            for(int j = 0; j<5; j++){
                int numero = (int) (Math.random() * abecedarios.length());
                name += abecedarios.charAt(numero);
                prom  = (float) Math.random() * 5 ;
            }
            int edad = (int) (Math.random() * 50)+1;
            insertarFinal(name, edad, prom);
            name = "";
        }
        
        
        // Registrar el tiempo de fin
        long tiempoFin = System.currentTimeMillis();
        
        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFin - tiempoInicio;
        
        // Mostrar el tiempo de ejecución en un JOptionPane
        JOptionPane.showMessageDialog(null, 
            "El método tardó " + tiempoEjecucion + " milisegundos en ejecutarse.");
    }
    public void ordenar(){
        long tiempoInicio = System.currentTimeMillis();
        if(inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay registros para ordenar");
            return;
        }
        int c = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            c++;
            temporal = temporal.getEnlace();
        }

        Nodo[] nodos = new Nodo[c];
        temporal = inicio;

        for (int i = 0; i < c; i++) {
            nodos[i] = temporal;
            temporal = temporal.getEnlace();
        }
        
        Arrays.sort(nodos, (n1, n2) -> n1.getName().compareTo(n2.getName()));

        inicio = nodos[0]; 
        temporal = inicio; 

        for (int i = 1; i < c; i++) {
            temporal.setEnlace(nodos[i]);  
            temporal = temporal.getEnlace(); 
        }
        temporal.setEnlace(null); 
        
        
        // Registrar el tiempo de fin
        long tiempoFin = System.currentTimeMillis();
        
        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFin - tiempoInicio;
        
        // Mostrar el tiempo de ejecución en un JOptionPane
        JOptionPane.showMessageDialog(null, 
            "El método tardó " + tiempoEjecucion + " milisegundos en ejecutarse.");

        JOptionPane.showMessageDialog(null, "Lista ordenada correctamente");
        
        
    }
    
    public void insertarAzar(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        int a=1;
        int b=1;
        int c=1;
        int d=0;
        boolean e=true;
        String word="";
        if(inicio==null){
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal=temporal.getEnlace();
                c++;
            }
            d = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar por nombre"+"\n"+"2. Agregar por posición"));
            if(d==2){
                a = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quiere colocarlo? Hay "+c+" posiciones"));
                if(a>c || a<1){
                    JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
                }else{
                    temporal = inicio;
                    while(b<(a-1)){
                        temporal=temporal.getEnlace();
                        b++;
                    }
                    if(a==1){
                        if(temporal!=null){
                            inicio=nuevo;
                            inicio.setEnlace(temporal);
                        }else{
                            inicio=nuevo;
                        } 
                    }else{
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
            }else if(d==1){
                word=JOptionPane.showInputDialog("Escriba el nombre delante del cuál colocará el registro");
                if(word!=null){
                    temporal = inicio;
                    while(b<=(c)){
                        if(b==1){
                            if(temporal.getName().toUpperCase().equals(word.toUpperCase())){
                                a=b;
                                b=c+2;
                                e=false;
                            }
                        }else{
                            temporal=temporal.getEnlace();
                            if(temporal.getName().toUpperCase().equals(word.toUpperCase())){
                                a=b;
                                b=c+2;
                                e=false;
                            }
                        }
                        b++;
                    }
                    if(e){
                        JOptionPane.showMessageDialog(null, "Ese nombre no está registrado");
                    }else{
                        b=1;
                        temporal = inicio;
                        while(b<(a-1)){
                            temporal=temporal.getEnlace();
                            b++;
                        }
                        if(a==1){
                            if(temporal!=null){
                                inicio=nuevo;
                                inicio.setEnlace(temporal);
                            }else{
                                inicio=nuevo;
                            } 
                        }else{
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
                }else{
                    JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
            }
            
        }
    }
    
    
    
    public void consultar(){
        Nodo temporal=inicio;
        int c=1;
        if(inicio==null){
            JOptionPane.showConfirmDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null,
                        "Nombre: "+temporal.getName()+"\n"+
                        "Edad: "+temporal.getAge()+"\n"+
                        "Promedio: "+temporal.getAverage()+"\n"+
                        "Posición: "+c);
                c++;
                temporal=temporal.getEnlace();
            }while(temporal!=null);
        }
    }
}
