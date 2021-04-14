/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Yamaoka
 */
public class Exemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont, num;
        num = (int) (Math.random() * 100);
        
        System.out.println("\t\t\tTabuada do " + num);
        
        for (cont = 1; cont <=10; cont++) {
            System.out.println(num + " x " + cont + " = " + cont * num);
        }
    }
    
}
