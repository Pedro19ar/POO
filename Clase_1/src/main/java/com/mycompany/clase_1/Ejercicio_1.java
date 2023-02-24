
package com.mycompany.clase_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad_juan, edad_alberto, edad_ana, edad_mama;
        
        System.out.println("Digite la edad de Juan: ");
        edad_juan = entrada.nextInt();
        
        edad_alberto = 2*(edad_juan/3);
        edad_ana = 4*(edad_juan/3);
        edad_mama = edad_juan+edad_alberto+edad_ana;
        
        System.out.println("La edad de Juan es: "+edad_juan+", La edad de alberto es: "+edad_alberto+", La edad de ana es: "+edad_ana+", La edad de mamá es: "+edad_mama);
        
    }
}
