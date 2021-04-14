package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase;
    private double taxaComissao;
    private double totalVendas = 0;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void addVendas(double totalVendas) {
        this.totalVendas += totalVendas;
    }

    @Override
    public double calcSalBruto() {
        return (getSalBase() + (taxaComissao * totalVendas));
    }

    @Override
    public double calcSalLiquido() {
        return (calcSalBruto() - calcDesconto() + calcGratificacao());
    }

    public double calcGratificacao() {
        if (calcSalBruto() <= 5000) {
            return (0);
        } else if (calcSalBruto() >= 5000 && calcSalBruto() <= 10000) {
            return (calcSalBruto() * 0.03);
        } else {
            return (calcSalBruto() * 0.05);
        }
    }
}
