/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Yamaoka
 */
public class Exemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] tabNum; // ponteiro para endereçamento de tipo int
        int cont;
        
        tabNum = new int[3];
        tabNum[0] = 34;
        tabNum[1] = 18;
        tabNum[2] = 27;
        
        for(cont = 0; cont < 3; cont++) {
            System.out.println("Ponteiro: " + tabNum[cont]);
        }
    }
    
}
