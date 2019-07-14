public class Quadrado extends Figura {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;       
    }    

    public double getLado() {
        return lado;
    }

    public double calculaArea() {
        return getLado()*getLado();
    }    
    
}