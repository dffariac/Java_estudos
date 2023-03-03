package Java_Guanabara.Exercicios_Aula9;

public class Main {
    
    public static Livro vetor [] = new Livro [5];


    public static void main (String [] args) {

        Pessoa Luiz = new Pessoa();
        vetor [0] = new Livro("Augusto Manzano","001", "Algoritmos e Lógica de progamação",
         100, Luiz );

         vetor[0].Abrir();
         vetor[0].Folear();
         vetor[0].AvançaPag();
    }
}
