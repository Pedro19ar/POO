
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_10 {
    
    //Atributos:
    String ni,nom;
    double pat, est;
    double pagmat = 50000;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        ni = JOptionPane.showInputDialog("Ingrese su numero de inscripcion: ");
        nom = JOptionPane.showInputDialog("Ingrese su nombre: ");
        pat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su patrimonio: "));
        est = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato social: "));
    }
    
    public void calcularPago(){
        if((pat > 2000000) & (est > 3)){
            pagmat = pagmat+(0.03*pat);
            System.out.println("El estudiante con numero de inscripcion "+ni+" y nombre "+nom+" debe pagar: $"+pagmat);
            
            }
        else{
            System.out.println("El estudiante con numero de inscripcion "+ni+" y nombre "+nom+" debe pagar: $"+pagmat);
        }
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //objeto:
        
        Ejercicio_10 estudiante = new Ejercicio_10();
        
        estudiante.leerDatos();
        estudiante.calcularPago();
    }
    
}
