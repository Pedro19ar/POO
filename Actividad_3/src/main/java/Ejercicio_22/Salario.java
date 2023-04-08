/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_22;

/**
 *
 * @author arist
 */
public class Salario {
    public static String calcularSalario(String nom, double horas, double valorHora){
        double sal = horas*valorHora;
        if (sal>450000){
            return "Su salario es "+sal;
        }
        else{
            return "Su nombre es " +nom;
        }
    }
}
