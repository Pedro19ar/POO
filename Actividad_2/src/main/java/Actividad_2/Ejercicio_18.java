

package Actividad_2;

import javax.swing.JOptionPane;


public class Ejercicio_18 {
    
    //Atributos:
    String codigo,nombre;
    int horas, valorHora;
    double retencion,porcentaje,salarioBruto,salarioNeto;
    
    //Metodos de la clase:
    
    public void leerDatos(){
        codigo = JOptionPane.showInputDialog("Digite el codigo del empleado: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas: "));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor por hora trabajada: "));
        porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de valor de retencion en la fuente: "));
    }
    
    public void salario_bruto(){
        salarioBruto = horas*valorHora;
    }
    
    public void retencion_fuente(){
        retencion = salarioBruto*porcentaje;
    }
    
    public void salario_neto(){
        salarioNeto = salarioBruto - retencion;
    }
    
    public void mostrarResultados(){
        System.out.println("El codigo del empleado es: "+codigo);
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El salario bruto es: "+salarioBruto);
        System.out.println("El salario neto es: "+salarioNeto);
        
    }
    
    //Metodo main:
    
    public static void main(String [] args){
        
        //Objeto:
        Ejercicio_18 persona = new Ejercicio_18();
        
        persona.leerDatos();
        persona.salario_bruto();
        persona.retencion_fuente();
        persona.salario_neto();
        persona.mostrarResultados();
    }            
}
