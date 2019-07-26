/**
 * Avaliacao
 */
public class Avaliacao {

    private String nomeAluno;
    private String disciplina;
    private ArrayList<Double> notas;
	public Avaliacao(String nomeAluno, String disciplina) {
		this.nomeAluno = nomeAluno;
        this.disciplina = disciplina;
        this.notas = new ArrayList<Double>();
	} 

   public void registrarNota(double nota){
    if(nota<0)
        throw new ArithmeticException("Nota não pode ser menor que zero");
    else if(nota>10)
        throw new ArithmeticException("Nota não pode ser maior que zero");
    else
        this.notas.add(nota);
   }

    public void calcularMedia(){
        double soma = 0;
        if(this.nota.size()==0)
        throw IllegalArgumentException("Divisor não pode ser zero");
        else
            for(Double pontos:notas)
                soma+= this.notas.get(pontos);
            System.out.println("Média: "+ soma/this.nota.size());       
   }    
}