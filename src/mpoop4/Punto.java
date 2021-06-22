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
public class Punto {
int x,y;

    public Punto() { //construcor vacio 
    }
      //constructor con valores 

    public Punto(int x, int y) {
        this.x = x; //this, hace referencia a la clase 
        this.y = y;
    }
    
    public void imprimePunto(){
        System.out.println("X="+x+"Y="+y);
    }
  
    
}
