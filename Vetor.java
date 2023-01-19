import java.util.Scanner;
public class Vetor {

static int vetor [] = new int [5]; // Declaração de um vetor com 5 posições
static int i; // Variável de controle
public static void main (String [] args) {

Scanner scan = new Scanner(System.in); // Método Scanner para entrada

for ( i = 0; i < 5; i++) { // For para gravar cada numero em uma posição do vetor 
    System.out.println("Digite um numero:");
    vetor [i] = scan.nextInt();
}
for ( int i = 1; i < 5; i++) { // Mostra as posições e os valores do vetor
    System.out.println("Valor: " + vetor [i] + " Posição:" + i);
}
scan.close();

}
}