public class Ave extends Animal {


    public Ave(double peso, int idade, String nome) {
        super(peso, idade, nome);
    }

    @Override
    public void locomover() {
        System.out.println(this.getNome() + "está voando");
    }

    @Override
    public void alimentar() {
        System.out.println(this.getNome() + "está se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + "está fazendo barulho");
    }
}
