public class Peixe extends Animal {

    private String corBolha;

    public String getCorBolha() {
        return corBolha;
    }

    public void setCorBolha(String corBolha) {
        this.corBolha = corBolha;
    }

    public Peixe(double peso, int idade, String nome) {
        super(peso, idade, nome);
    }

    @Override
    public void locomover() {
        System.out.println(this.getNome() + "está nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando" + this.getNome());
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho de peixe");
    }

    public void soltarBolha(){
        System.out.println(this.getNome() + " soltando bolha.");
    }
}
