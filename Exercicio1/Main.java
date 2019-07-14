/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado(3);
        Retangulo r1 = new Retangulo(2,4);
        Figura t1 = new Triangulo(3,4);
        Figura c1 = new Circulo(4);
        System.out.println(q1.calculaArea());
        System.out.println(r1.calculaArea());
        System.out.println(t1.calculaArea());
        System.out.println(c1.calculaArea());
    }
}