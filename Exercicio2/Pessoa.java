import java.util.*;
/**
 * Pessoa
 */
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

   public Pessoa(String nome, int idade, double altura){
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
   }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    
    public int compareTo(Pessoa outro){
        return this.nome.compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return this.nome +"; " + this.idade + "; " + this.altura;     }

  
}