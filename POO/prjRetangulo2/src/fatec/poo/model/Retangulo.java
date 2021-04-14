package fatec.poo.model;

/**
 *
 * @author Danillo Aledes
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        altura = a;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double b) {
        base = b;
    }
    
    public double calcArea() {
        return base * altura;
    }
    
    public double calcPerimetro() {
        return 2 * (base + altura);
    }
    
    public double calcDiagonal(){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }
}