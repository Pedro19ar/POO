
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_21 {
    //Atributos:
    
    double lado1, lado2, lado3, perimetro, semiperimetro, area;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado 1: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado 2: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado 3: "));
        
    }
    public void calcularPerimetro(){
        perimetro = lado1+lado2+lado3;
    }
    
    public void calcularSemiperimetro(){
        semiperimetro = (lado1+lado2+lado3)/2;
    }
    
    public void calcularArea(){
        area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
    }
    
    public void mostrarResultados(){
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("El semiperimetro del triangulo es: "+semiperimetro);
        System.out.println("El area del triangulo es: "+area);
    } 
    
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_21 triangulo = new Ejercicio_21();
        
        triangulo.leerDatos();
        triangulo.calcularPerimetro();
        triangulo.calcularSemiperimetro();
        triangulo.calcularArea();
        triangulo.mostrarResultados();
    }
}
