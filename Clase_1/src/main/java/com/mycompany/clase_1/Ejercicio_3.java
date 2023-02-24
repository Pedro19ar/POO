
package com.mycompany.clase_1;


public class Ejercicio_3 {
     public static void main(String[] args) {
        double horas, razon, retencion, salario_bruto, salario_neto;
        
        horas = 48;
        razon = 5;
        
        salario_bruto = horas*razon;
        retencion = salario_bruto*0.125;
        salario_neto = salario_bruto-retencion;
        
        System.out.println("El salario bruto es: "+salario_bruto);
        System.out.println("La retencion en la fuente es: "+retencion);
        System.out.println("El salario neto es: "+salario_neto);
        
        
       
    }
}

    

