
package Actividad_2;

import javax.swing.JOptionPane;


public class Ejercicio_14 {
    
    //Atributos:
    double vd1,vd2,vd3,salar,totven,porven,salar1,salar2,salar3;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        vd1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del departamento 1: "));
        vd2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del departamento 2: "));
        vd3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del departamento 3: "));
        salar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario que reciben los vendedores de los departamentos: "));
        
    }
    
    public void calcularTotalVentas(){
        totven = vd1+vd2+vd3;
    }
            
    public void calcularPorcentajeVentas(){
        porven = totven*0.33;
    }
    
    public void calcularSalarios(){
        if(vd1>porven){
            salar1 = salar + (0.2*salar);
        }
        else{
            salar1 = salar;
        }
        
        if(vd2>porven){
            salar2 = salar + (0.2*salar);
        }
        else{
            salar2 = salar;
        }
        
        if(vd3>porven){
            salar3 = salar + (0.2*salar);
        }
        else{
            salar3 = salar;
        }
        
    }
    
    public void mostrarResultados(){
        System.out.println("Salario vendedores depto. 1: "+salar1+" , salario vendedores depto. 2: "+salar2+" , salario vendedores depto. 3: "+salar3);
    }
            
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        
        Ejercicio_14 vendedores = new Ejercicio_14();
        
        vendedores.leerDatos();
        vendedores.calcularTotalVentas();
        vendedores.calcularPorcentajeVentas();
        vendedores.calcularSalarios();
        vendedores.mostrarResultados();
    }
}
