package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */
public class QuartoHotel {

    private int numQuarto, numRG;
    private double valorDiaria, totalFaturado;
    private boolean situacao;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;

        this.situacao = false;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void reservar(int numRG) {
        this.numRG = numRG;
        this.situacao = true;
    }

    public double liberar(int numDias) {
        double valHospedagem;

        valHospedagem = this.valorDiaria * numDias;

        this.totalFaturado = valHospedagem;

        this.numRG = 0;
        this.situacao = false;

        return this.totalFaturado;
    }
}
