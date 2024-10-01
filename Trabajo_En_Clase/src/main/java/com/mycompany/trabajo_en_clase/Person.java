/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_en_clase;

/**
 *
 * @author SCIS2-09
 */
public class Person {

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the adelante
     */
    public Person getAdelante() {
        return adelante;
    }

    /**
     * @param adelante the adelante to set
     */
    public void setAdelante(Person adelante) {
        this.adelante = adelante;
    }

    /**
     * @return the atras
     */
    public Person getAtras() {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Person atras) {
        this.atras = atras;
    }
    private int edad;
    private String nombre;
    private Person adelante;
    private Person atras;
    
}
