
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;


/*
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Instância de um objeto da classe Aluno
        Instrutor objInstrutor = new Instrutor(1010, "Felipe Yamaoka", "(15) 98188-8092");
        
        objInstrutor.setAreaAtuacao("Desenvolvedor JS FullStack");
        System.out.println("Identificacao: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Area de Atuacao: " +objInstrutor.getAreaAtuacao());
        
        
        // Instância de um objeto da classe Cliente
        Cliente objCliente = new Cliente("466.059.098-44", "Grasiele Gaia", "(15) 70707-7069");
        
        objCliente.setPeso(39.5);
        objCliente.setAltura(1.53);
        System.out.println("\n\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone " + objCliente.getTelefone());
        System.out.println("Altura: " + df.format(objCliente.getAltura()));
        System.out.println("Peso: " + df.format(objCliente.getPeso()));
    }
    
}
