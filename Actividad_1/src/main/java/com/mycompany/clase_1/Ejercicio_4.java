
package com.mycompany.clase_1;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, area, long_circ;
        
        System.out.println("Digite el radio: ");
        radio = entrada.nextDouble();
        
        area = Math.PI*(Math.pow(radio, 2));
        long_circ = 2*Math.PI*radio;
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia es: "+long_circ);
        
    }

    
}
