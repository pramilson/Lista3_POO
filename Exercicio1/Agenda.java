import java.util.*;/**
 * Agenda
 */
public class Agenda {

    private String nome;
    private final List<Pessoa> agenda = new LinkedList<>();

    public Agenda(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }    

    public void armazenaPessoa(Pessoa p){
        agenda.add(p);
    }

    public void removePessoa(String nome){
        Boolean existe = false;
        for(Pessoa p: agenda){
            if(p.getNome().equals(nome)){
                existe = true;
                agenda.remove(p);
            }
        }
        if (existe==false)
            System.out.println("Pessoa não cadastrada na agenda");               
    }     

    int buscaPessoa(String nome){
        Boolean existe = false;        
        for(Pessoa p: agenda){
            if(p.getNome().equals(nome)){
                existe = true;
                return agenda.indexOf(p);
            }
        }
        if (existe==false)
            System.out.println("Pessoa não cadastrada na agenda");
            return 0;
    }

    public void imprimeAgenda(){

        Collections.sort(agenda);
        
        for(Pessoa p: agenda){
            System.out.println(p);
        }     
    }

    public void imprimePessoa(int index){
        for(Pessoa p:agenda){
            if(agenda.indexOf(p)==index)
                System.out.println("Dados do indice: "+p);
        }
        

    }

}


