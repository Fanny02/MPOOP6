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
public class Circulo {
    //float PI = (float) 3.1416;
    //nivel de seguridad, Private, para que nadie mas lo vea
    private static float PI = 3.1416f; //static, indica que es constante  
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if(radio<0)
            radio = 0;
        this.radio = radio;
    }
    
    public float perimetro(){
        return 2 * PI * radio;
    }
    
    public float area(){
       return PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    }
    

