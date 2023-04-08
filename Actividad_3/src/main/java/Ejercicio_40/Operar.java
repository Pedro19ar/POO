/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_40;


public class Operar {
    
    public static String calcularRaiz(double a, double b, double c, double d, double e){
        
        return "a= "+Math.round(Math.sqrt(a)*100)/100d+", b= "+Math.round(Math.sqrt(b)*100)/100d+", c= "+Math.round(Math.sqrt(c)*100)/100d+", d= "+Math.round(Math.sqrt(d)*100)/100d+", e= "+Math.round(Math.sqrt(e)*100)/100d;
    }
    
    public static String calcularCuadrado(double a, double b, double c, double d, double e){
        return "a= "+Math.pow(a, 2)+", b= "+Math.pow(b,2)+", c= "+Math.pow(c, 2)+", d= "+Math.pow(d, 2)+", e= "+Math.pow(e,2);
    }
    
    public static String calcularCubo(double a, double b, double c, double d, double e){
        return "a= "+Math.pow(a, 3)+", b= "+Math.pow(b,3)+", c= "+Math.pow(c, 3)+", d= "+Math.pow(d, 3)+", e= "+Math.pow(e,3);
    }
}
