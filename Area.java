import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double raio;
        double area;
        final double Pi = 3.14;

        System.out.println ("Digite a área do circulo: ");

        Scanner r = new Scanner (System.in);
        raio = r.nextDouble();
        r.close();

        area = Pi * raio * raio;

        System.out.println (" A área do circulo é : " + area);
        
    }
}