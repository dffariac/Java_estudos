public class Manzano6F {
    
    static int vetorA[] = new int [15];
    static int vetorB[] = new int [15];
    static int vetorC[] = new int [30];
    static int i;

    public static void main (String [] args) {

        for ( i = 0; i < 15; i++) {
            vetorA[i] = i+1;
            vetorB[i] = i+16;
        }
        for (i = 0; i < 15; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i+15] = vetorB[i];
        }
        for ( i = 0; i <30; i++) {

            System.out.println("Vetor C, Posição: " + (i+1) + " Valor = " + vetorC[i]);
        }
    }












}
