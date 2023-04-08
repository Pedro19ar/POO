/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author arist
 */
public class PagoMatricula {
    public static double calcularPago(double pat, double est){
        double pagmat = 50000;
        if((pat > 2000000) & (est > 3)){
            pagmat = pagmat+(0.03*pat);
            return pagmat;
            
            }
        else{
            return pagmat;
        }
    }
}
