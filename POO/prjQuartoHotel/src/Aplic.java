
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);

        int numQuarto, numRg, numDias, opcao;
        double valorDiaria;

        System.out.println("-> Digite o número do quarto: ");
        numQuarto = entrada.nextInt();

        System.out.println("\n-> Digite o valor da diária: ");
        valorDiaria = entrada.nextDouble();

        QuartoHotel objQrtHotel = new QuartoHotel(numQuarto, valorDiaria);

        do {
            System.out.println("\nEscolha a operação: ");
            System.out.println("1 - Consultar Quarto");
            System.out.println("2 - Reservar Quarto");
            System.out.println("3 - Liberar Quarto");
            System.out.println("4 - Consultar Faturamento Quarto");
            System.out.println("5 - Sair");
            System.out.println("\nDigite uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: {
                    if (objQrtHotel.isSituacao() == false) {
                        System.out.println("\nQuarto Livre");
                    } else {
                        System.out.println("\nQuarto Ocupado");
                    }

                    break;
                }
                case 2: {
                    if (objQrtHotel.isSituacao() == true) {
                        System.out.println("\nO quarto já foi reservado");
                    } else {
                        System.out.println("\n\tDigite o número do RG: ");
                        numRg = entrada.nextInt();

                        objQrtHotel.reservar(numRg);

                        System.out.println("\nQuarto reservado!");
                    }

                    break;
                }
                case 3: {
                    if (objQrtHotel.isSituacao() == false) {
                        System.out.println("\nO quarto já está livre");
                    } else {
                        System.out.println("\n\tDigite a quantidade de dias que ficou no quarto: ");
                        numDias = entrada.nextInt();

                        System.out.println("\nQuarto livre! O total a ser pago pela estadia é de: R$" + df.format(objQrtHotel.liberar(numDias)));
                    }

                    break;
                }
                case 4: {
                    System.out.println("\nO total faturado pelo quarto é de: R$" + df.format(objQrtHotel.getTotalFaturado()));
                    break;
                }
            }
        } while (opcao < 5);
    }

}
