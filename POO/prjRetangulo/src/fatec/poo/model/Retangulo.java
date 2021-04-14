package fatec.poo.model;

/*
 * @author Felipe Yamaoka
 */

public class Retangulo {

    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcArea() {
        return (base * altura);
    }

    public double calcPerimetro() {
        return (2 * (base + altura));
    }
}
