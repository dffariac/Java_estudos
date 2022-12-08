
public class Soma {

public static void main(String[] args) {

    int sum = 0;
    int count = 0;

        for (count = 1; count < 100 ; count ++){
            if ( count % 2 == 0) {
                sum = sum + count;
            }
        }
    System.out.println("A soma dos numeros é " + sum);
}


}