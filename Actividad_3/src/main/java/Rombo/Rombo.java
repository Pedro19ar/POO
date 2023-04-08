/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rombo;


public class Rombo {
    double diagonal1;
    double diagonal2;
    double lado;
    
    //Metodo constructor:
    public Rombo(double diagonal1, double diagonal2, double lado){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado = lado;
    }
    
    //Metodo de la clase:
    
    double calcularArea(){
        return ((diagonal1*diagonal2)/2);
    }
    
    double calcularPerimetro(){
        return (lado*4);
    }
    
}
