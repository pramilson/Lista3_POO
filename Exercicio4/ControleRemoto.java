/**
 * ControleRemoto
 */
public interface ControleRemoto {

    public void aumentarVolume();
    public void diminuirVolume();
    public int consultarVolume();
    public void aumentarCanal();
    public void diminuirCanal();
    public void trocarCanal();    
    public void consultarCanal(int);

    
}