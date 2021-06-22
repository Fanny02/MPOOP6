/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author X512J
 */

public class Perro {
    String nombre;
    String raza;
    String color;
    
    public void comer(){
        System.out.println("Comiendo");
    }
    
    public void dormir(){
        System.out.println("ZzzZzzZzzZzzZzz");
    }
    
    public void ladrar(){
        System.out.println("Guau Guau Guau");
    }

    
    
    
   
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
     public Perro() {
    } 
     public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
}
