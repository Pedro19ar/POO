
package Actividad_2;

import java.util.Scanner;

public class Ejercicio_15 {
    
    //Atributos:
    
    int pesoA, pesoB, pesoC, pesoD;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = sc.nextInt();
        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = sc.nextInt();
    }
    
    public void calcularPeso(){
        if ((pesoA == pesoB) && (pesoA == pesoC)) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } 
            else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } 
        else if ((pesoA == pesoB) && (pesoA == pesoD)) {
            System.out.println("La esfera C es la diferente");
                if (pesoC > pesoA) {
                    System.out.println("Y es de mayor peso.");
                }     
                else {
                    System.out.println("Y es de menor peso.");
                }
        } 
        else if ((pesoA == pesoC) && (pesoA == pesoD)) {
            System.out.println("La esfera B es la diferente");
                if (pesoB > pesoD) {
                    System.out.println("Y es de mayor peso.");
                } 
                else {
                    System.out.println("Y es de menor peso.");
                }
        } 
        else {
            System.out.println("La esfera A es la diferente");
                if (pesoA > pesoB) {
                    System.out.println("Y es de mayor peso.");
                } 
                else {
                    System.out.println("Y es de menor peso.");
                }
        }

    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_15 esfera = new Ejercicio_15();
        
        esfera.leerDatos();
        esfera.calcularPeso();
    }
}
