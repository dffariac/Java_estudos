import java.util.Scanner;
public clas Array {
  
  public static void main ( String [] args){
    Scanner scan = new Scanner (System.in) // Criação de um scanner
    
      public int inicio; // Váriavel de inicio do laço
      public int fim; // Váriavel de fim de laço
      public int i; // Váriavel de incremento do laço
    
    System.out.println("Digite o inicio do laço"); 
    inicio = scan.nextInt(); // Capta o número digitado pelo usuário
    
    System.out.println("Digite o fim do laço);
    fim = scan.nextInt(); // Capta o número digitado pelo usuário
    scan.close(); // Fechamento do scanner
                       
    for ( i = inicio; inicio < fim; i++){
      System.out.println(i);
    }
                       } // Fim do método main
                       }
