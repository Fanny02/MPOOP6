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
public class Persona {
    private String nombre;
    private String apellido;
    private String lugar;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String lugar, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugar = lugar;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", lugar=" + lugar + ", fNacimiento=" + fNacimiento + '}';
    }

    
    
}
