/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_19;

/**
 *
 * @author arist
 */
public class TrianguloEquilatero {
    public static double calcularPerimetro(double lado){
        double perimetro;
        perimetro = lado*3;
        return perimetro;
    }
    
    public static double calcularAltura(double lado){
        double altura;
        altura = (Math.sqrt(3)*lado)/2;
        return altura;
    }
    
    public static double calcularArea(double lado, double altura){
        double area;
        area = (lado*altura)/2;
        return area;
    }
}
