
package com.mycompany.ejercicio_matrices;

import javax.swing.JOptionPane;

public class Menu {
    Plato menu[];
    int num_platos[][];
    String semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    int[] ventas_dia = new int[6];
    
    public void crearMenu(int cantidad){
        menu = new Plato[cantidad];
        int i = 0;
        while(i<cantidad){
            menu[i] = new Plato();
            menu[i].setName(JOptionPane.showInputDialog("Diga el nombre del plato "+(i+1)));
            menu[i].setPrice(Integer.parseInt(JOptionPane.showInputDialog(null,"Diga el precio del plato "+(i+1))));
            menu[i].setIngredients(JOptionPane.showInputDialog("Diga los ingredientes "+(i+1)));
            i++;
        }
    }
    public void consultarMenu(){
        String x = "";
        for(int i = 0; i<menu.length ; i++){
            x = x+ menu[i].getName()+": "+menu[i].getIngredients()+": $"+menu[i].getPrice()+"\n";
        }
        JOptionPane.showMessageDialog(null, " Platos:  \n \n"+x);
    }
    
    public void ingresarDatos(){
        num_platos = new int[6][menu.length];
        for(int i = 0; i<semana.length; i++){
            for(int j = 0; j<menu.length;j++){
                num_platos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ventas para el dia "+semana[i]+ " Plato: "+ menu[j].getName()));
                ventas_dia[i] += num_platos[i][j];
            }
        }
        
    }
    public void analizar(){
        int best_day = 0;
        int bad_day = 1000000;
        int total_ventas = 0;
        int[] venta_plato = new int[menu.length];
        for(int i = 0; i<semana.length; i++){
            for(int j = 0; j<menu.length;j++){
                venta_plato[j] = venta_plato[j]+ num_platos[i][j];
                if(ventas_dia[i]>best_day){
                    best_day = i;
                }
                if(ventas_dia[i]<bad_day){
                    bad_day = ventas_dia[i];
                }
            }
            
        }
        int best_plate = venta_plato[0];
        int best = 0;
        int bad_plate = venta_plato[0];
        int bad = 0;
        for(int i = 0; i< venta_plato.length; i++){
            if(venta_plato[i]>best_plate){
                best_plate = venta_plato[i];
                best = i;
            }
            if(venta_plato[i]<bad_plate){
                bad_plate = venta_plato[i];
                bad = i;
            }
            total_ventas += venta_plato[i];
            
        }
        
        JOptionPane.showMessageDialog(null, "Numero de platos vendidos: "+ total_ventas +"\n" 
            + "Dia mas vendido: "+ semana[best_day]+"\n"
            +"Con "+ventas_dia[best_day] +" platos" +"\n"
            + "Dia menos vendido: "+ semana[bad_day]+"\n"
            +"Con "+ventas_dia[bad_day] +" platos" +"\n"
            + "Plato mas vendido: "+ menu[best].getName()+ " con "+venta_plato[best]+" platos"+"\n"
        );
    }
}
