/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trapecio;


public class Trapecio {
    //Atributos:
    double baseMayor;
    double baseMenor;
    double altura;
    double lado;
    //Metodo constructor:
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado = lado;
    }
    
    //Metodos de la clase:
    
    double calcularArea(){
        return (((baseMayor+baseMenor)*altura)/2);
    }
    
    double calcularPerimetro(){
        return((lado*2)+baseMayor+baseMenor);
        
    }
}
