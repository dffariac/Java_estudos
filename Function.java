import java.util.Scanner;
public class Function {

static int a,b, resultado; 
static int resposta;
// Criação de uma função que soma
static int Soma ( int x, int y) { // X e Y são parametros 
        return (x + y);
 }
 static int Divisão (int x, int y) {
    return x/y;
 }
 static int Subtração ( int x, int y) { // X e Y são parametros 
    return (x - y);
}
static int Multiplicação ( int x, int y) { // X e Y são parametros 
    return (x * y);
}
 
public static void main (String [] args) {
 
    Scanner scan = new Scanner (System.in);
    System.out.println("Digite um numero:");
    a = scan.nextInt();
    System.out.println("Digite um numero:");
    b = scan.nextInt();

    System.out.println ("Escolha uma opção:");
    
    System.out.println("1-Divisão\n2-Substração\n3-Adição\n4-Multiplicação");
    resposta = scan.nextInt();
   
    
    scan.close();
    
    switch (resposta) {
       
        case 1:
        resultado = Divisão(a,b);
        System.out.println("O resultado da divisão de " + a + " e " + b + " é = " + resultado);
        break;
        
        case 2:
        resultado = Subtração(a,b);
        System.out.println("O resultado da subtração de " + a + " e " + b + " é = " + resultado);
        break;

        case 3:
        resultado = Soma(a,b);
        System.out.println("O resultado da soma de " + a + " e " + b + " é = " + resultado);
        break;

        case 4:
        resultado = Multiplicação(a,b);
        System.out.println("O resultado da multiplicação de " + a + " e " + b + " é = " + resultado);
        break;
        
        default:
        
        System.out.println("Opção inválida");

    }
    
    
    
}


}