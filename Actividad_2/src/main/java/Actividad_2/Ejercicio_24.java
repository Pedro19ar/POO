
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_24 {
    //Atributos:
    
    double a,b,c,mayor;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la esfera a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la esfera b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la esfera c: "));     
    }
    
    public void calcularMayor(){
        if((a>b)&&(a>c)){
            mayor = a;
            System.out.println("El mayor peso encontrado fue: "+mayor+" correspondiente a la esfera a");
        }
        else if((b>a)&&(b>c)){
            mayor = b;
            System.out.println("El mayor peso encontrado fue: "+mayor+" correspondiente a la esfera b");
        }
        else{
            mayor = c;
            System.out.println("El mayor peso encontrado fue: "+mayor+" correspondiente a la esfera c");
           
        }
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_24 esfera = new Ejercicio_24();
        
        esfera.leerDatos();
        esfera.calcularMayor();
       
    }
}
