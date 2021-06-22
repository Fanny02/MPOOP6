/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;
/**
 *
 * @author X512J
 * @version 1.2 15.6.2021
 * 
 */
public class MPOOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("/**********Practica 4*************/");
        System.out.println("/*********Punto*********/");
        Punto punto = new Punto(); //creando un objeto punto
        punto.imprimePunto(); //para saber que vlaores tienen 
        //asignando valores 
        punto.x=5; 
        punto.y=6;
        punto.imprimePunto();
        
         Punto punto2 = new Punto (8,17); //objeto de la clase punto "int c"
            punto2.imprimePunto();
            
            System.out.println("/***********Coche***********/");
            Coche miCoche = new Coche(); //con constructor vacio
            System.out.println(miCoche.toString());
            miCoche.setColor("rojo");
            miCoche.setMarca("mazda");
            miCoche.setModelo("CX-5");
            miCoche.setPuertas(4);
            Persona per1 = new Persona ();
            Persona per2 = new Persona ();
            Persona per3 = new Persona ();
            Persona per4 = new Persona ();
            per1.setNombre("Lupita");
            per1.setApellido("Morales");
            per1.setLugar("Pasajero 1");
            per2.setNombre("Estefany");
            per2.setApellido("Zavala");
            per2.setLugar("Chofer");
            per3.setNombre("Leonardo");
            per3.setApellido("Velazaquez");
            per3.setLugar("Copiloto");
            per4.setNombre("Luis");
            per4.setApellido("Martinez");
            per4.setLugar("Pasajero 2");
            miCoche.setPasajero(per2,per3,per1,per4);
            System.out.println(miCoche.toString());
            
           
            
            System.out.println("/***********Perro***********/");
            Perro miPerro = new Perro("chimuelo","labrador","blanco");
            //System.out.println(miPerro.toString());, ya se esta casteando automaticamente, es lo mismo que la linea de abajo 
            System.out.println(miPerro);
            
            
            System.out.println("/***********Practica 5**********/");
            Circulo cir1 = new Circulo();
            System.out.println(cir1);
            //cir1.radio=5;
            cir1.setRadio(5); //para modificar la varible privada de radio 
            System.out.println(cir1);
            System.out.println(cir1.perimetro());
            System.out.println(cir1.area());
            
            Circulo cir2 = new Circulo();
            cir2.setRadio(-10);
            System.out.println(cir2);
            System.out.println("Perimetro = "+cir2.perimetro());
 
            //System.out.println("/*********Composición***********/");
            //Persona per1 =new Persona();
            //per1.setNombre("Isabel");
            //per1.setApellido("Hernandez");
            //Fecha naci = new Fecha();
            //naci.setDia(10);
            //naci.setMes(6);
            //naci.setAnio(1999);
            //per1.setfNacimiento(naci);
            //System.out.println(per1);
            
            
            
    }
    
}
