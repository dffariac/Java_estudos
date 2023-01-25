public class Manzano6G {
    
    static int vetorA[] = new int [10];
    static int vetorB[] = new int[10];
    static int i,j;

    public static void main (String [] args) {

        for (i = 0; i < vetorA.length ; i++) {
            vetorA[i] = i + 2;
        }

        for (i=0; i < vetorB.length; i++) {
            for (j = 0; j <= (vetorA.length  - (i+1)); j++) {
                vetorB[i] = vetorA[j];
            }
        }


        for(i=0; i < vetorB.length; i++) {
            System.out.println("Vetor B, Posição: " + (i+1) + " Valor = " + vetorB[i]);
        }
        for(i=0; i < vetorA.length; i++) {
            System.out.println("Vetor A, Posição: " + (i+1) + " Valor = " + vetorA[i]);
        }

    }









}
