
package Actividad_2;

import java.util.Scanner;


public class Ejercicio_23 {
    
    //Atributos
    double a,b,c;
    
    //Metodo constructor:
    
    public Ejercicio_23(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Metodos de la clase:
    
    public void soluciones(){
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } 
        else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una solución real: " + x);
        } 
        else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
        }
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a: ");
        double vala = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de b: ");
        double valb = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de c: ");
        double valc = entrada.nextDouble();
        
        //Objeto:
        
        Ejercicio_23 ecuacion = new Ejercicio_23(vala,valb,valc);
        
        ecuacion.soluciones();
        
    }
}
