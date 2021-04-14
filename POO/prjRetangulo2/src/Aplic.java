import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Danillo Aledes
 */
public class Aplic {
    public static void main(String[] args) {
        // instanciacao de objetos da classe Scanner e da classe Retangulo
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medBase, medAlt;
        int opcao=0;
        
        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            
            System.out.println("\nDigite sua opcao: ");
            opcao = entrada.nextInt();
            
            System.out.println("\nMedida da Altura: " + objRet.getAltura());
            System.out.println("Medida da Base: " + objRet.getBase());
            
            switch(opcao) {
                case 1: {
                    System.out.println("Medida da Área = " + objRet.calcArea());
                    break;
                }
                case 2: {
                    System.out.println("Medida do Perímetro = " + objRet.calcPerimetro());
                    break;
                }
                case 3: {
                    System.out.println("Medida da Diagonal:  " + objRet.calcDiagonal());
                    break;
                }
            }
            
        } while(opcao < 4);
    }
}