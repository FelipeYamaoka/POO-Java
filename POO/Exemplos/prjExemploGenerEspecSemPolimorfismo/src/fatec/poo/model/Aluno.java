package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */
public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNascimento) { 
        super(nome, dataNascimento); // Chamada do método construtor da super classe Pessoa
        this.regEscolar = regEscolar; 
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

}
