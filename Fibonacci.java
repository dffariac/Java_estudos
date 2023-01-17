public class Fibonacci {

static int i;
static int inicio = - 1;
static int atual = 1;
static int soma;

public static void main (String [] args) {

for ( i = 0; i <= 15 ; i++) {
    inicio = atual;
    atual = soma;
    soma = inicio + atual;
    System.out.print("\t" + soma);
    
}


}

}