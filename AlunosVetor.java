import java.util.Scanner;
public class AlunosVetor {

    static String nome [] = new String [4];
    static int nota1 [] = new int [4];
    static int nota2 [] = new int [4];
    static int media [] = new int [4];
    static int i;

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        for ( i = 0; i < 4;i++) {
            System.out.println ("Digite o nome do aluno:");
            nome [i] = scan.next()
            ;
            System.out.println ("Digite a nota da P1 do " + nome [i]);
            nota1[i] = scan.nextInt();
            System.out.println ("Digite a nota da P2 do " + nome [i]);
            nota2[i] = scan.nextInt();

            media [i] = (nota1[i] + nota2[i]) / 2;
        }
        scan.close();
        for ( i = 0; i < 4; i++) {
            System.out.println(nome[i] + " Nota P1:" + nota1[i] + " Nota P2:" + nota2[i] + " Média:" + media[i]);
        }
    }
}