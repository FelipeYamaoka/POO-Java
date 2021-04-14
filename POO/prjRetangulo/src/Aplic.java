
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        // Instalação de objetos da calsse Scanner
        // e da classe retãngulo
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();

        double medBase, medAltura;
        int opcao;

        System.out.println("Digita a altura: ");
        medAltura = entrada.nextDouble(); //scanf("%f", &medAltura);

        System.out.println("Digita a base: ");
        medBase = entrada.nextDouble(); //scanf("%f", &medBase);

        // passagem mensagens
        objRet.setAltura(medAltura);
        objRet.setBase(medBase);

        do {
            System.out.println("\n****************************");
            System.out.println("1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Sair");
            System.out.println("****************************");
            System.out.println("\nDigite sua opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nMedida da Área " + objRet.calcArea());
                    break;
                case 2:
                    System.out.println("\nMedida do Perímetro " + objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("\nAPLICAÇÃO ENCERRADA");
                    break;
                default:
                    System.out.println("\nInsira uma opção válida");
            }

        } while (opcao < 3);
    }

}
