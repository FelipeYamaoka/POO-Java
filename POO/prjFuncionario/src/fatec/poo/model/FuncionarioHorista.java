
package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao); // chamada ao método construtor da superclasse funcionário
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    
    
    @Override
    // Foi aplicado o polimorfismo
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao() {
        return(0.075 * calcSalBruto());
    }
    
    public double calcSalLiquido() {
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }
}
