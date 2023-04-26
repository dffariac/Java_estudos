import java.util.Scanner;
public class Reptil extends Animal {


    public Reptil(double peso, int idade, String nome) {
        super(peso, idade, nome);
    }

    @Override
    public void locomover() {
        System.out.println(this.getNome() + " está se locomovendo");
    }

    @Override
    public void alimentar() {
        Scanner sc = new Scanner(System.in);
        String resposta = "Sim";
        try {
            while (resposta.equals("Sim")) {
                System.out.println(this.getNome() + " está alimentado");
                System.out.println("Deseja alimentar novamente?");
                resposta = sc.nextLine();
                sc.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void emitirSom() {
        System.out.println("Está fazendo barulho");
    }

}
