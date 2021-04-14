
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;

/*
 * @author Felipe Yamaoka
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Funcionário Horista
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Estagiário de Enfermagem");
        System.out.println("Registro   =>   " + funcHor.getRegistro());
        System.out.println("Nome   =>   " + funcHor.getNome());
        System.out.println("Cargo   =>   " + funcHor.getCargo());
        System.out.println("Data de Admissao   =>   " + funcHor.getDtAdmissao());
        System.out.println("Salario Bruto   =>   " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto   =>   " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação   =>   " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido   =>   " + df.format(funcHor.calcSalLiquido()));
        
        
        // Funcionário Mensalista
        FuncionarioMensalista funcMens = new FuncionarioMensalista(3030, "Felipe Yamaoka", "14/12/2021", 600.0);
        
        funcMens.setNumSalMin(2.5);
        funcMens.setCargo("Estagiário de TI");
        System.out.println("\n\nRegistro   =>   " + funcMens.getRegistro());
        System.out.println("Nome   =>   " + funcMens.getNome());
        System.out.println("Cargo   =>   " + funcMens.getCargo());
        System.out.println("Data de Admissao   =>   " + funcMens.getDtAdmissao());
        System.out.println("Salario Bruto   =>   " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto   =>   " + df.format(funcMens.calcDesconto()));
        System.out.println("Salario Liquido   =>   " + df.format(funcMens.calcSalLiquido()));
        
    }
    
}
