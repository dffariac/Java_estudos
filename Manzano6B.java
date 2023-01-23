import java.util.Scanner;

public class Manzano6B {

static int vetorA [] = new int [10];
static int vetorB [] = new int [10];
static int i;

public static void main (String [] args) {

Scanner scan = new Scanner(System.in);

for (i = 0; i < 10; i++) {
    System.out.println("Digite o " + (i +1) +  "° numero");
    vetorA [i] = scan.nextInt();
}
for (i = 0; i < 10; i++) {
    vetorB[i] = vetorA[i] * 3;
}
for (i = 0; i < 10; i++) {
    System.out.println("O resultado de " + vetorA[i] +  " é = " + vetorB[i]);
}

}

}