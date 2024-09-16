/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimple;


import java.util.Arrays;
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
    
<<<<<<< HEAD
    public void ordenar(){
         if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay registros para ordenar");
            return;
        }

        // Paso 1: Contar los nodos
        int c = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            c++;
            temporal = temporal.getEnlace();
        }

        // Paso 2: Crear un arreglo para los nodos
        Nodo[] nodos = new Nodo[c];
        temporal = inicio;

        // Paso 3: Rellenar el arreglo con los nodos completos
        for (int i = 0; i < c; i++) {
            nodos[i] = temporal;  // Guardar el nodo completo
            temporal = temporal.getEnlace();
        }

        // Paso 4: Ordenar el arreglo de nodos por el nombre alfabéticamente
        Arrays.sort(nodos, (n1, n2) -> n1.getNombre().compareTo(n2.getNombre()));

        // Paso 5: Reconstruir la lista enlazada con los nodos ordenados
        inicio = nodos[0];  // El primer nodo del array será el nuevo inicio
        temporal = inicio;  // Reiniciamos temporal para reconstruir la lista

        for (int i = 1; i < c; i++) {
            temporal.setEnlace(nodos[i]);  // Establecer el enlace al siguiente nodo
            temporal = temporal.getEnlace();  // Avanzar al siguiente nodo
        }
        temporal.setEnlace(null);  // El último nodo debe apuntar a null

        JOptionPane.showMessageDialog(null, "Lista ordenada correctamente");
    }
=======
    public void eliminarPorPosicion(){
        int a=1;
        int b = 1;
        int c = 1;
        int d = 1;
        Nodo temporal2 = null;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
        Nodo temporal = inicio;
        while(temporal.getEnlace()!=null){
            temporal = temporal.getEnlace();
            if(b==a-1){
                temporal2 = temporal.getEnlace();
            }
        }
        temporal.setEnlace(temporal2.getEnlace());
    }
    
>>>>>>> 6bfca273931f197b519a7e17a817dc66683b82d7
    
    public void crear(){
        String[] abecedario={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","u","v","w","x","y","z"};
        int nods = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes "));
        String name = "";
        double prom = 0;
        for(int i = 0; i<nods; i++){
            for(int j = 0; j<5; j++){
                int numero = (int) (Math.random() * abecedario.length);
                name += abecedario[numero];
                prom =  Math.random() * 5 + 1;
            }
            int edad = (int) (Math.random() * 50)+1;
            insertarFinal(name, edad, nods);
            name = " ";
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
