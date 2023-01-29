import java.util.Scanner;
public class Manzano6L {
    
    static int vetorA [] = new int [10];
    static float vetorB [] = new float [10];
    static String resp;
    static int i;

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        resp = "S";

        while ( resp.equals("S")) {
            for (i = 0; i < vetorA.length; i++) {
                System.out.println ("Digite o " + (i+1) + "° numero que deseja saber a metade:");
                vetorA[i] = scan.nextInt();
                vetorB[i] = vetorA[i]/2;
            }
                for (i = 0; i < vetorA.length; i++) {
                System.out.println ("A metade de " + vetorA[i]+ " é = " + vetorB[i]);
                    }
        System.out.println("Deseja continuar? [S] ou [N]");
        resp = scan.next();
        }
scan.close();

    }
 






}
