/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Yamaoka
 */
public class Exemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media = 0;
        int cont;

        double [] tabNum = new double[10];


        for (cont = 0; cont < 10; cont++) {
            tabNum[cont] = (Math.random() * 100);
            System.out.println("Contador: " + cont + "\t\tPonteiro: " + tabNum[cont]);
            media = media + tabNum[cont];
        }

        media = media / 10;
        System.out.println("Média: " + media);
    }

}
