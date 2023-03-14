
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    //Atributos:
    int a,b;
    
    //Metodos de la clase:
    public void leerDatos(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el otro numero: "));
    }
    
    public void compararNumeros(){
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        }
        else if(a==b){
            System.out.println(a+" es igual que "+b);
        }
        else{
            System.out.println(a+" es menor que "+b);
        }
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_7 p1 = new Ejercicio_7();
        
        p1.leerDatos();
        p1.compararNumeros();
    }
}  