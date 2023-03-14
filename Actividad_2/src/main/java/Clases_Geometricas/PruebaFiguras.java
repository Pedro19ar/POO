
package Clases_Geometricas;

public class PruebaFiguras {
    public static void main(String [] args){
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(8,6, 12);
        Trapecio figura6 = new Trapecio(12,9,6,7);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El area del rombo es = "+figura5.calcularArea());
        System.out.println("El perimetro del rombo es = "+figura5.calcularPerimetro());
        System.out.println();
        System.out.println("El area del trapecio es = "+figura6.calcularArea());
        System.out.println("El perimetro del trapecio es = "+figura6.calcularPerimetro());
    }
}
   

