
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;


/*
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);

        int numero, opcao;
        double saldo = 0, valDeposito, valSaque;

        System.out.println("Digite o numero da conta: ");
        numero = entrada.nextInt();

        ContaCorrente objCC = new ContaCorrente(numero, saldo);

        do {
            System.out.println("\nDigite a operação: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\t Digite a opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("\n Digite o valor a ser depositado na conta " + numero + ": ");
                    valDeposito = entrada.nextInt();

                    objCC.depositar(valDeposito);
                    break;
                }
                case 2: {
                    System.out.println("\n Digite o valor a ser sacado da conta " + numero + ": ");
                    valSaque = entrada.nextDouble();

                    if (valSaque <= objCC.getSaldo()) {
                        objCC.sacar(valSaque);
                    } else {
                        System.out.println("\n\n Saldo insuficiente!\n");
                    }
                    break;
                }
                case 3: {
                    System.out.println("\n Saldo atual - R$" + df.format(objCC.getSaldo()) + "      ||\n");
                }
            }
        } while (opcao < 4);
    }

}
