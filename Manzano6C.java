import java.util.Scanner;

public class Manzano6C {

    static int vetorA [] = new int [5];
    static int vetorB[] = new int [5];
    static int vetorC[] = new int [5];
    static int i;

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        for ( i = 0; i <5 ;i++) {
            System.out.println("Digite o " + (1+i) + "° numero do vetor A");
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o " + (1+i) + "° numero do vetor B");
            vetorB[i] = scan.nextInt();
        }
        scan.close();
        for ( i  = 0; i<5; i++ ) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        for  (i = 0; i < 5; i++) {
            System.out.println("A subtração de " + vetorA[i] + " do vetor A e de " + vetorB[i] + " no vetor B é = " + vetorC[i]);
        }
    }
}