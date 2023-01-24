public class Manzano6D {
    static int vetorA[] = new int [15];
    static int vetorB [] = new int [15];
    static int i;

    public static void main (String [] args) {

        for (i= 0; i <15; i++) {
            vetorA [i] = i + 1;
            vetorB [i] = vetorA[i] * vetorA[i];
            System.out.println("O quadrado de " + vetorA[i] + " é = " + vetorB[i]);
        }
    }
}
