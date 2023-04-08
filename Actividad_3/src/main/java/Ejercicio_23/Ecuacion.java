/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_23;

/**
 *
 * @author arist
 */
public class Ecuacion {
    public static String resolverEcuacion(double a, double b, double c){
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            return("La ecuación no tiene soluciones reales.");
        } 
        else if (discriminante == 0) {
            double x = -b / (2 * a);
            return("La ecuación tiene una solución real: " + x);
        } 
        else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
        }
    }
}
