package estudos;

public class Pessoas { 

    public static void main (String [] args) { // Classe principal do programa

        Pessoa Pessoa1 = new Pessoa (); // Instância da Classe Pessoa, ou seja, um objeto

        Pessoa1.Nome = "Luiz Fernando"; // Atribuição de valor ao Atributo Nome
        Pessoa1.Cidade = "Suzano";
        Pessoa1.CPF = 1234;
        Pessoa1.Nascimento = "13/03/2002";
        Pessoa1.Genero = "Masculino";
        Pessoa1.Status();// Chamada do metodo Status
        
    } // Fim da classe main  
}