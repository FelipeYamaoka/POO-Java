
package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdeHoras;

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }
    
    public void comprar(double qtdeHoras) {
        this.qtdeHoras += qtdeHoras;
    }
    
    public void jogar(double qtdeHoras) {
        this.qtdeHoras -= qtdeHoras;
    }
    
    public void brinde() {
        this.qtdeHoras *= 2;
    }
    
    // Getters
    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }
    
    
    
}
