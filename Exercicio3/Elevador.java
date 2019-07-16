import java.util.list;
public class Elevador {

    private int total_andares;
    private int capacidade;
    private int andar_atual;
    private int qtde_pessoas;
       
    public Elevador(int total_andares, int capacidade) {
        this.total_andares = total_andares;
        this.capacidade = capacidade;    
       
    }
    public void inicializaElevador(){
        this.andar_atual = 0;
        this.qtde_pessoas = 0;
    }

    public void entraPessoa(){
        if(this.qtde_pessoas<this.capacidade)
            this.qtde_pessoas++;
        else
            System.out.println("Elevador lotado");
    }

    public void saiPessoa(){
        if(this.qtde_pessoas>0)
            this.qtde_pessoas--;
        else
            System.out.println("Elevador vazio");
    }

    public void sobeAndar(){
        if(this.andar_atual<this.total_andares)
            this.andar_atual++;
        else
            System.out.println("Elevador está no último andar");
    }

    public void desceAndar(){
        if(this.andar_atual>0)
            this.andar_atual--;
        else
            System.out.println("Elevador já está no térreo");
    }

    public void exibe_Informacao(){
        System.out.println("Pessoas: "+ this.qtde_pessoas + ", Andar atual: " + this.andar_atual + ".");
    }
}
