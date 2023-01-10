

public class Maior 
{

    public static void main ( String []args) {
        int a = 5;
        int b = 2;
        int c = 9;
        int d = 10;
        int e = 1;
        
        int maior = 0;
        int menor = 0;

        if ( a > b) {
            maior = a;
            menor = b;
        }
        else {
            menor = a;
            maior = b;
        }
        if ( c > maior) {
            maior = c;
        }
       else if ( c < menor ){
        menor = c;
    }
        if ( d > maior) {
            maior = d;
        }
    else if ( d < menor ){
        menor = d;
    }
        if ( e > maior) {
            maior = e;
        }
        else if ( e < menor ){
        menor = e;
        }

        System.out.println("O maior numero é " + maior + " e o menor numero é " + menor);

    }
}