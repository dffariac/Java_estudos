package estudos;
import java.util.Scanner;

public class Switch {


    public static void main (String [] args) {
    
     String sexo;
     String nome;   
    Scanner scan = new Scanner (System.in); // Criação do objeto scanner

    System.out.println("Digite o seu nome:");
    nome = scan.nextLine();

    System.out.println("Digite o seu sexo [M] para masculino e [F] para feminino");
    sexo = scan.nextLine();
    scan.close();

// Estrutura de switch
    switch (sexo) { // Sexo é o parametro a ser analisado para realizar os casos
        
        case "F" : // Estrutura de casos
        System.out.println(nome + " você é uma mulher.");
        break; // Break utilzado para não rodar os outros casos

        case "M" :
        System.out.println(nome + " você é um homem.");
        break;

        default:
        System.out.println("Sexo Inválido.");

    }

    }
    
}
