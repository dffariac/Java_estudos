import java.util.Scanner;

public class Litros {

    public static void main (String[] args) {

        int litros;
        double aumento;
        double decremento;
        

        Scanner scan = new Scanner (System.in);
        System.out.println("Qual é o total de litros da represa: ");
        litros = scan.nextInt();
        scan.close();
        

        aumento = litros * (1 + 0.34);
        decremento = litros * ( 1 - 0.4) * 1000;

        System.out.println ("Quando há aumento de capacidade a represa tem capacide de " + aumento +"L");
        System.out.println ("Quando há diminuição de capacidade a represa tem capacide de " + decremento +"mL");
    

    }
    
}
