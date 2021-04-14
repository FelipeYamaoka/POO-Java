import fatec.poo.model.GameShop;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        
        int codCliente, idade, opcao;
        double qtdeHoras;
        
        System.out.println("Digite o codigo do cliente: ");
        codCliente = entrada.nextInt();
        
        System.out.println("\nDigite a idade do cliente: ");
        idade = entrada.nextInt();
        
        GameShop objGS = new GameShop(codCliente, idade);
        
         do {
            System.out.println("\nEscolha a operação: ");
            System.out.println("1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo de Horas");
            System.out.println("5 - Sair");
            System.out.print("\n\t Digite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1: {
                    System.out.println("\nDigite a quantidade de horas que deseja comprar: ");
                    qtdeHoras = entrada.nextDouble();
                    
                    objGS.comprar(qtdeHoras);
                    break;
                }
                case 2: {
                    System.out.println("\nDigite a quantidade de horas que deseja jogar: ");
                    qtdeHoras = entrada.nextDouble();
                    
                    if (qtdeHoras <= objGS.getQtdeHoras()) {
                        objGS.jogar(qtdeHoras);
                    } else {
                        System.out.println("\nDesculpe, quantidade de horas insuficiente!");
                    }
                    break;
                }
                case 3: {
                    objGS.brinde();
                    System.out.println("\nParabéns! A sua quantidade de horas acabam de ser dobradas!");
                    break;
                }
                case 4: {
                    System.out.println("\nSeu saldo de horas é: " + df.format(objGS.getQtdeHoras()) + "h");
                    break;
                }
            }
        } while (opcao < 5);
    }
    
}
