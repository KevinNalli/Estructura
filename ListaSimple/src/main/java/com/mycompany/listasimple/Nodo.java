
package com.mycompany.listasimple;

public class Nodo {

    /**
     * @return the enlace
     */
    public Nodo getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the average
     */
    public float getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(float average) {
        this.average = average;
    }
    
    private String name;
    private int age;
    private float average;
    
    private Nodo enlace;
    
}
