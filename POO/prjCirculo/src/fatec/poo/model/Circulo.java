package fatec.poo.model;

/**
 *
 * @author Danillo Aledes
 */
public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double r) {
        raio = r;
    }
    
    public double calcArea() {
        return Math.PI * Math.pow(raio,2);
    }
    
    public double calcPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcDiametro() {
        return 2 * raio;
    }
}
