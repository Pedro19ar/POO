/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7;

/**
 *
 * @author arist
 */
public class NumeroMayor {
    public static String calcularMayor(double a, double b){
        if (a > b){
            return a+" es mayor que" +b;
        }
        else if (a < b){
        return b+" es mayor que "+a;
        }
        else{
            return a+" y "+b+" son iguales ";
        }  
    }
}
