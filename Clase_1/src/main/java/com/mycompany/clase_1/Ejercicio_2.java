
package com.mycompany.clase_1;

import java.util.Scanner;

public class Ejercicio_2 {
     public static void main(String[] args) {
        int x,y,suma;
        
        Scanner entrada = new Scanner(System.in);
        
        suma = 0;
        System.out.println("Digite el primer numero: ");
        x = entrada.nextInt();
        suma = suma+x;
        System.out.println("Digite el segundo numero: ");
        y = entrada.nextInt();
        x = x+((int)Math.pow(y, 2));
        suma = suma+(x/y);
        
        System.out.println("El valor de la suma es: "+suma);
    }
}


