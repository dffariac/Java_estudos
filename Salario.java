import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        
        double horasTrabalhadas; // Horas Trabalhadas
        double valorHora; // Valor Hora Aula 
        double salarioBruto;
        double salarioLiquido; // Salaŕio calculado com desconto
        double desconto; // Desconto do Salário
        double PD ; // Percentual de Desconto

        Scanner scan = new Scanner (System.in); // Scanner para entrada de valores

        System.out.println("Quantas horas você trabalhou este mês: ");
        horasTrabalhadas = scan.nextDouble();

         System.out.println("Qual o valor hora aula? ");
         valorHora = scan.nextDouble();
        
         System.out.println("Qual é a porcentagem de desconto?( em decimal)");
         PD = scan.nextDouble();

        
        salarioBruto = horasTrabalhadas * valorHora;
        salarioLiquido = (1 - PD) * salarioBruto;
        desconto = salarioBruto - salarioLiquido;

        System.out.println("O valor do salário bruto foi de: R$" + salarioBruto);
        System.out.println("O valor do salário liquido foi de: R$" + salarioLiquido);
        System.out.println("O desconto foi de R$" + desconto);

        scan.close(); // Fechamento do scanner
    }
    
}
