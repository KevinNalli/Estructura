
package com.mycompany.ejercicio_matrices;

import javax.swing.JOptionPane;

public class Menu {
    String platos[];
    int num_platos[][];
    String semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    
    public void crearMenu(int cantidad){
        platos = new String[cantidad];
        int i = 0;
        while(i<cantidad){
            platos[i]= JOptionPane.showInputDialog("Diga el nombre del plato "+(i+1));
            i++;
        }
    }
    public void consultarMenu(){
        String x = "";
        for(int i = 0; i<platos.length ; i++){
            x = x +platos[i]+" ";
        }
        JOptionPane.showMessageDialog(null, " Platos: "+x);
    }
    
    public void ingresarDatos(){
        num_platos = new int[6][platos.length];
        for(int i = 0; i<semana.length; i++){
            for(int j = 0; j<platos.length;j++){
                num_platos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ventas para el dia "+semana[i]+ " Plato: "+ platos[j]));
            }
        }
        
    }
}
