
package fatec.poo.model;

/**
 * @author Felipe Yamaoka
 */
public class Aluno {
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    // Setter
    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNtPrv1(double ntPrv1) {
        this.ntPrv1 = ntPrv1;
    }

    public void setNtPrv2(double ntPrv2) {
        this.ntPrv2 = ntPrv2;
    }

    public void setNtTrab1(double ntTrab1) {
        this.ntTrab1 = ntTrab1;
    }

    public void setNtTrab2(double ntTrab2) {
        this.ntTrab2 = ntTrab2;
    }
    
    
    // Getter
    public int getRa() {
        return ra;
    }

    public double getNtPrv1() {
        return ntPrv1;
    }

    public double getNtPrv2() {
        return ntPrv2;
    }

    public double getNtTrab1() {
        return ntTrab1;
    }

    public double getNtTrab2() {
        return ntTrab2;
    }
    
    
    // Funções de retorno
    public double calcMediaProva() {
        return 0.75 * ( getNtPrv1() + 2 * getNtPrv2() ) /3; 
    }
    
    public double calcMediaTrab() {
        return 0.25 * ( getNtTrab1() + getNtTrab2() )/ 3;
    }
    
    public double calcMediaFinal() {
        return calcMediaProva() + calcMediaTrab();
    }
}
