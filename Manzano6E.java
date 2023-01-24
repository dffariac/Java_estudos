public class Manzano6E {
  static int vetorA []  = new int [5];
  static int vetorB[] = new int [5];
  static int i, j;

  public static void main (String [] args) {

    for (i = 0; i<5; i++) {
        vetorA[i] = i + 1;
        vetorB[i] = 1;
    }
    for ( i = 0; i < 5; i++) {
        for ( j = 1; j <= vetorA[i]; j++) {
            vetorB[i] = j * vetorB[i];

        }
    }
    for (i = 0; i<5; i++) {
        System.out.println("O fatorial de " + vetorA[i] + " do vetor A é = " + vetorB[i]);
    }
  }
}
