
package Actividad_2;

import javax.swing.JOptionPane;

public class Ejercicio_12 {
    
    //Atributos:
    String nom;
    int nht, vhn, het, hee8,salario;
 
    //Metodos de la clase:
    
    public void leerDatos(){
        nom = JOptionPane.showInputDialog("Ingrese el nombre del trabajador: ");
        nht = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas trabajadas: "));
        vhn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de hora normal trabajada: "));
        het = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas extra trabajadas: "));
        hee8 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas extra que exceden de 8: ")); 
    }
    
    
    public void calcularSalario(){
        if(nht>40){
            het = nht-40;
            if(het>8){
                hee8 = het-8;
                salario = 40*vhn+16*vhn+hee8*3*vhn;
            }
            
            else{
                salario = 40*vhn+het*2*vhn;
            }
        }
        else{
            salario = nht*vhn;
        }
        
    }
    
    public void mostrarResultados(){
        System.out.println("El trabajador "+nom+" devengo: $ "+salario);
    }
    
    
    //Metodo main:
    
    public static void main(String [] args){
        //Objeto:
        
        Ejercicio_12 trabajador = new Ejercicio_12();
        
        trabajador.leerDatos();
        trabajador.calcularSalario();
        trabajador.mostrarResultados();
    }
}
