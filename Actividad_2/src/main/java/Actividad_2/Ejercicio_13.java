
package Actividad_2;

import java.util.Scanner;

public class Ejercicio_13 {
    //Atributos:
    String color;
    double valcomp,valpag;
    int pdes;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color de la bolita: ");
        color = entrada.next();
        System.out.println("Ingrese el valor de la compra: ");
        valcomp = entrada.nextDouble();
    }
    
    public void calcularDescuento(){
        if(color.equals("blanco")){
            pdes = 0;
        }
        else if(color.equals("verde")){
            pdes = 10;
        }
        else if(color.equals("amarillo")){
            pdes = 25;
        }
        else if(color.equals("azul")){
            pdes = 50;
        }
        else{
            pdes = 100;
        }      
    }
    
    
    public void precioFinal(){
        valpag = valcomp-((pdes*valcomp)/100);
    }
    
    public void mostrarResultado(){
        System.out.println("El color de la bolita es: "+color);
        System.out.println("El descuento es del "+pdes+"%");
        System.out.println("El cliente debe pagar: $ "+valpag);
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_13 cliente = new Ejercicio_13();
        
        cliente.leerDatos();
        cliente.calcularDescuento();
        cliente.precioFinal();
        cliente.mostrarResultado();
    }
}
