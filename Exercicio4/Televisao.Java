public class Televisao implements ControleRemoto{

    private int volume;
    private int canal;

    public Televisao(){
        this.canal = 1;
        this.volume = 0;
    }

    public void aumentarVolume(){
        if(this.volume<100)
            this.volume++;
        else
            System.out.println("Volume está no máximo");
    }

    public void diminuirVolume(){
        if(this.volume>0)
            this.volume--;
        else
            System.out.println("Volume está no mínimo");
    }

    public int consultarVolume(){
        return this.volume;
    }
    
    public void aumentarCanal(){
        if(this.canal!=50)
            this.canal++;
        else    
            this.canal = 1;
    }

    public void diminuirCanal(){
        if(this.canal!=1)
            this.canal--;
        else    
            this.canal = 50;
    }

    public int consultarCanal(){
        return this.canal;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }

}