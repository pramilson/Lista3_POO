public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1,double lado2){
       this.lado1 = lado1;
        this.lado2 = lado2;
    }  
       
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double calculaArea(){
        return getLado1()*getLado2();
     }  
    
}

 