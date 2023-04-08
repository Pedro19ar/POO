/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_41;

/**
 *
 * @author arist
 */
public class Mayor {
    public static String HallarMayor(int a, int b, int c, int d, int e){
        if ((a>b)&(a>c)&(a>d)&(a>e)){
            return "El mayor es "+a;
        }
        else if((b>a)&(b>c)&(b>d)&(b>e)){
            return "El mayor es "+b;
        }
        else if((c>a)&(c>b)&(c>d)&(c>e)){
            return "El mayor es "+c;
        }
        else if((d>a)&(d>b)&(d>c)&(d>e)){
            return "El mayor es "+d;
        }
        else if((e>a)&(e>b)&(e>c)&(e>d)){
            return "El mayor es "+e;
        }
        else{
            return "Todos los numeros son iguales";
        }
    }    
}
