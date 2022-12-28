package estudos; // Criação do pacote estudos

public class Pessoa { // Criação da Classe Pessoa
    String Nome; // Criação do atributo Nome
    String Cidade;
    String Nascimento;
    int CPF;
    String Genero;

    public void Status () { // Criação do método Status que exibe a informação
        System.out.println("Nome:\t" + this.Nome); //.this referencia o objeto que será instanciado
        System.out.println("Cidade:\t" + this.Cidade);
        System.out.println("Nascimento:" + this.Nascimento);
        System.out.println("CPF:" + this.CPF);
        System.out.println("Genêro:\t" + this.Genero);
    }
}
