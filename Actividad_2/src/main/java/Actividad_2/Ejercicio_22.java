
package Actividad_2;

import java.util.Scanner;

public class Ejercicio_22 {
    
    //Atributos:
    
    String nombre;
    int sal_bas, horas,sal_men;
    
    //Metodo constructor:
    
    public Ejercicio_22(String nombre, int sal_bas, int horas){
        this.nombre = nombre;
        this.sal_bas = sal_bas;
        this.horas = horas;
    }
    
    //Metodos de la clase:
    
    public void salarioMensual(){
        sal_men = sal_bas*horas;
    }
    
    public void mostrarResultado(){
        if(sal_men > 450000){
            System.out.println("El nombre del empleado es: "+nombre+" y tiene un sueldo de: "+sal_men+" mensual");
        }
        else{
            System.out.println("El nombre del empleado es: "+nombre);
        }
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        String name = entrada.next();
        
        System.out.println("Ingrese el salario por hora del empleado: ");
        int sal = entrada.nextInt();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        int hora = entrada.nextInt();
        
        //Objeto:
        
        Ejercicio_22 empleado = new Ejercicio_22(name,sal,hora);
        
        empleado.salarioMensual();
        empleado.mostrarResultado();
    }
}
