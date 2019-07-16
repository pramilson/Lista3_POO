public class Televisao implements ControleRemoto{

    private int volume;
    private int canal;

    public Televisao(){
        this canal = 0;
        this volume = 0;
    }

    public void aumentarVolume(){
        if(volume<100)
            volume++;
        else
            System.out.println("Volume está no máximo");
    }

    public void diminuirVolume(){
        if(volume>0)
            volume--;
        else
            System.out.println("Volume está no mínimo")
    }

    

}