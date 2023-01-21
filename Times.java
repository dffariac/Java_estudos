import java.util.Scanner;

public class Times {
    static String times [] = new String [3];
    static int i;
    static int j;

public static void main (String [] args) {

    Scanner scan = new Scanner (System.in);

    for ( i = 0; i < 3; i++) {
        System.out.println("Digite o nome do " + (i+1) +"° time:");
        times[i] = scan.next();
    }
    scan.close();

    for (i = 0; i < 3; i++) {
        for ( j = i+1; j <3 ; j++) {
            System.out.println(times[i] + " [] x []" + times [j]);
        }
    }
    for (i = 2; i > 0; i--) { // Faz a ordenação inversa do vetor
        for ( j = i-1; j > -1 ; j--) {
            System.out.println(times[i] + " [] x []" + times [j]);
        }
    }
}



}