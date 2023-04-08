/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_18;

/**
 *
 * @author arist
 */
public class Empleado {
    public static double calcularSalarioBruto(double horas, double valorHora){
        double salarioBruto;
        salarioBruto = horas*valorHora;
        return salarioBruto;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double porcentaje){
        double salarioNeto;
        double retencion;
        porcentaje = porcentaje/100;
        retencion = salarioBruto*porcentaje;
        salarioNeto = salarioBruto-retencion;
        return salarioNeto;
    }
   
    
}
