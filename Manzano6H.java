import java.util.Scanner;
public class Manzano6H {
    
    static  String vetorA[] = new String [5];
    static String vetorB[] = new String [5];
    static String vetorC [] = new String [10];
    static int i;

    public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    for ( i = 0; i < vetorA.length; i++) { // VetorA.lenght referência o tamanho do vetor

        System.out.println("Digite o "+ (i+1) + "° nome do Vetor A");
        vetorA[i] = scan.next();
        System.out.println("Digite o "+ (i+1) + "° nome do Vetor B");
        vetorB[i] = scan.next();
    }

    for( i = 0; i < vetorA.length; i++) {
        vetorC[i] = vetorA[i];
        vetorC[i+5] = vetorB[i];
    }
    for ( i=0; i < vetorC.length; i++) {
        System.out.println("Vetor C, Posição: " + (i+1) + " Nome = " + vetorC[i]);


    }
    scan.close();
}
}
