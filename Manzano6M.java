import java.util.Scanner;
public class Manzano6M {

static int vetorA [] = new int[10];
static int i,n;
static String resp;

public static void main(String[] args) {

Scanner scan = new Scanner (System.in);
resp = "S";

while ( resp.equals("S")) { // Em java nao se utiliza operadores relacionais para Strings
    System.out.println("Digite o numero que deseja saber a tabuada");
    n = scan.nextInt();
        for ( i = 0; i < 10; i++) {
            vetorA[i] = (1+i) * n;
        }
            for ( i = 0; i < 10; i++) {
            System.out.println(n + " X " + (i+1) + " = " + vetorA[i]);
            }
        System.out.println("Deseja continuar? [S] ou [N]");
        resp = scan.next();
}
scan.close();



}

}