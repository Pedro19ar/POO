
package com.mycompany.clase_1;

public class Ejercicio_2 {
     public static void main(String[] args) {
        int x,y,suma;
        
        suma = 0;
        x = 20;
        suma = suma+x;
        y = 40;
        x = x+((int)Math.pow(y, 2));
        suma = suma+(x/y);
        
        System.out.println("El valor de la suma es: "+suma);
    }
}


