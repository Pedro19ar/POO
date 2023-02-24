
package com.mycompany.clase_1;

import java.util.Scanner;


public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, cuadrado, cubo;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextDouble();
        
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        
        System.out.println("El cuadrado del numero es: "+cuadrado);
        System.out.println("El cubo del numero es: "+cubo);
        
        
        
    }

    
}
