import java.util.Scanner;

public class Notas {


        public static void main (String[] args) {

        double P1;
        String nome;
        double P2;
        double atividades;
        double media;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o nome do aluno:");
        nome = scan.nextLine();

        System.out.println("Digite a nota da P1:");
        P1 = scan.nextDouble();

        System.out.println("Digite a nota da P2:");
        P2 = scan.nextDouble();

        System.out.println("Digite a nota das atividades:");
        atividades = scan.nextDouble();
        scan.close();

        media = ((P1*4) + (P2*4) + (atividades*2))/10;

             
            
            if ( media >= 9) {
                System.out.println( "A média do " + nome + " foi: " + media);
                System.out.println("O resultado do aluno foi  Plenamente Satisfatório");
            }
            else if ( media >= 7 && media < 9) {
                System.out.println( "A média do " + nome + " foi: " + media);
                System.out.println("O resultado do aluno foi Satisfatório");
            }
            else if ( media >= 4 && media < 7) {
                System.out.println( "A média do " + nome + " foi: " + media);
                System.out.println("Aluno de recuperação ");
            }
            else if (  media < 4) {
                System.out.println( "A média do " + nome + " foi: " + media);
                System.out.println("O resultado do aluno foi Não Satisfatório");
            }
            

        
        
        }
}