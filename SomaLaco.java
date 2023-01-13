
import java.util.Scanner;
public class SomaLaco {

    static int numero;
    static int soma;
    static int valores;
    static int contador = 1;

    public static void main (String [] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println ("Digite quanto valores deseja somar:");
        valores = scan.nextInt();
        

        while ( contador <= valores) { // Laço
            System.out.println("Digite o " + contador + "° numero para somar");
            numero = scan.nextInt();
            soma = soma + numero;
            contador = contador + 1; // Controle do laço, se tirar fica um looping infinito
        }
        System.out.println("A soma dos numeros é " + soma);
        scan.close();

    }

}