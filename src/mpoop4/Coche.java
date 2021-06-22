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
public class Coche { 
    private String color;
    private String modelo;
    private String marca;
    private int puertas;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;

    public Coche() {
    }

    public Coche(String color, String modelo, String marca, int puertas) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
    }

    public void encender(){
        System.out.println("Encendiendo");
    }
    
    public void apagar(){
        System.out.println("Apagando, bye");
    }
    
    public void avanzar(){
        System.out.println("Avanzando");
    }
    
    //public void lugares(){
        
    //}
    
    public void frenar(){
        System.out.println("Frenando, stop");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    //public void getPasajero(){
        //return pasajero;
    //}
    
   
    public void setPasajero(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto=copiloto;
        this.pasajero1=pasajero1;
        this.pasajero2=pasajero2;
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", puertas=" + puertas + ", chofer=" + chofer + ", copiloto= "+ copiloto+ ",pasajero1=" + pasajero1+ ",pasajero2=" + pasajero2+'}';
    }

   

    
      
}

