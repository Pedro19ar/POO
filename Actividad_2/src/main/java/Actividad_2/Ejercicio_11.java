
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_11 {
    //Atributos:
    int n1,n2,n3,mayor;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
        
    }
    
    public void calcularMayor(){
        if((n1 > n2) & (n1> n3)){
            mayor = n1;
        }
        else if ((n2>n1) & (n2>n3)){
            mayor = n2;
        }
        else{
            mayor = n3;
        } 
    }
    
    public void mostrarResultado(){
        System.out.println("El valor mayor entre "+n1+", "+n2+" y "+n3+" es: "+mayor);
    }
    
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //objeto:
        
        Ejercicio_11 numero = new Ejercicio_11();
        
        numero.leerDatos();
        numero.calcularMayor();
        numero.mostrarResultado();
    }
}
