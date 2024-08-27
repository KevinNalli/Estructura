
package com.mycompany.ejercicio_matrices;

import javax.swing.JOptionPane;

public class Menu {
    String platos[];
    int num_platos[][];
    String semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    int[] ventas_dia = new int[6];
    
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
            x = x +platos[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, " Platos:  \n"+x);
    }
    
    public void ingresarDatos(){
        num_platos = new int[6][platos.length];
        for(int i = 0; i<semana.length; i++){
            for(int j = 0; j<platos.length;j++){
                num_platos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ventas para el dia "+semana[i]+ " Plato: "+ platos[j]));
                ventas_dia[i] += num_platos[i][j];
            }
        }
        
    }
    public void analizar(){
        int best_day = 0;
        int total_ventas = 0;
        int[] platoss = new int[platos.length];
        for(int i = 0; i<semana.length; i++){
            for(int j = 0; j<platos.length;j++){
                platoss[j] = platoss[j]+ num_platos[i][j];
                if(ventas_dia[i]>best_day){
                    best_day = i;
                }
            }
            total_ventas += platoss[i];
        }
        
        JOptionPane.showMessageDialog(null, "Numero de platos vendidos: "+ total_ventas +"\n" 
            + "Dia mas vendido: "+ semana[best_day]+"\n"+"Con "+ventas_dia[best_day] +" platos" +"\n"
        );
    }
}
