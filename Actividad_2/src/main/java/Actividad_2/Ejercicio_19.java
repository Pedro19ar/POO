
package Actividad_2;

import javax.swing.JOptionPane;


public class Ejercicio_19 {
    //Atributos:
    double lado;
    double perimetro, area, altura;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado del triangulo equilatero: "));
    }
    
    public void calcularAltura(){
        altura = Math.sqrt(Math.pow(lado, 2)- Math.pow((lado/2),2));
    }
    
    public void calcularPerimetro(){
        perimetro = lado*3;
    }
    
    public void calcularArea(){
        area = (lado*altura)/2;
    }
    
    public void mostrarResultados(){
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("La altura del triangulo es: "+altura);
        System.out.println("El area del triangulo es: "+area);
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        //Objeto:
        
        Ejercicio_19 triangulo = new Ejercicio_19();
        
        triangulo.leerDatos();
        triangulo.calcularAltura();
        triangulo.calcularPerimetro();
        triangulo.calcularArea();
        triangulo.mostrarResultados();
    }
    
    
}
