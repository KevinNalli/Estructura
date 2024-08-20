/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.academico;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-03
 */
public class Ventana_Principal extends javax.swing.JFrame {
    int[] menores = new int[5];
    int[] mayores = new int[5];
    int[] viejos = new int[5];
    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tittle = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tittle.setText("SISTEMA ACADEMICO");

        Create.setText("Crear");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Search.setText("Consultar");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(Tittle)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Create)
                .addGap(59, 59, 59)
                .addComponent(Search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Tittle)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create)
                    .addComponent(Search))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        
        
        
        int ime = 0;
        int ima = 0;
        int ivi = 0;
        
            int edad =Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Diga su edad"));
        
            if(edad<18 && edad>0){
                if(ime<6){
                    menores[ime] = edad;
                    ime++;
                }
                JOptionPane.showMessageDialog( rootPane,"Usted es menor de edad");
            }else if(edad>=18 && edad<=60){
                if(ima<6){
                    menores[ima] = edad;
                    ima++;
                }
                JOptionPane.showMessageDialog( rootPane,"Usted es mayor de edad");
            }else if(edad>60 && edad<100){
                if(ivi<6){
                    menores[ivi] = edad;
                    ivi++;
                }
                JOptionPane.showMessageDialog( rootPane,"Usted es adulto mayor");            
            }else{
                JOptionPane.showMessageDialog( rootPane,"Edad Invalida");            
            }
            if(ima>5 && ime>5 && ivi>5){
                 JOptionPane.showMessageDialog( rootPane,"Cupos llenos");                 
            }
        
        
    }//GEN-LAST:event_CreateActionPerformed
    String mayoresf = " ";
    String menoresf = " ";
    String viejosf = " ";
    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        
        for(int i = 0; i<=4; i++){
            
            if(mayores[i] != 0){
                mayoresf = mayoresf + " "+mayores[i];
            }
            
            if(menores[i] != 0){
                menoresf = menoresf + " "+menores[i];
            }
            
            if(viejos[i] != 0){
                viejosf = viejosf + " "+viejos[i];
            }
        }
        System.out.println(menoresf + "\n" + mayoresf + "\n"+ viejosf);
                         
    }//GEN-LAST:event_SearchMouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Tittle;
    // End of variables declaration//GEN-END:variables
}
