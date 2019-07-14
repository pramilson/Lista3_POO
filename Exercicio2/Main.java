/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Agenda a = new Agenda("AgendaDeRamilson");
        Pessoa p1 = new Pessoa("Ramilson", 39, 1.79);
        Pessoa p2 = new Pessoa ("Alice", 6, 1.20);
        a.armazenaPessoa(p1);
        a.armazenaPessoa(p2);
        a.imprimeAgenda();
        a.imprimeAgenda();
        System.out.println(a.buscaPessoa("Ramilson"));
        a.imprimePessoa(1);



    }
}