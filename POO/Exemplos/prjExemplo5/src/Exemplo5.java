/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Yamaoka
 */
public class Exemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont, num;
        num = (int) (Math.random() * 100);

        System.out.println("\t\t\tTabuada do " + num);

        cont = 1;
        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        }
    }

}
