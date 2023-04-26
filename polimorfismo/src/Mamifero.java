public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(double peso, int idade, String nome) {
        super(peso, idade, nome);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println(this.getNome() + " está correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println(this.getNome() + " está se alimentando!");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está fazendo barulho!");
    }
}
