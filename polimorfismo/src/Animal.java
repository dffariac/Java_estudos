public abstract class Animal {
    private double peso;
    private String membros;
    private int idade;
    private String nome;

    public Animal(double peso, int idade, String nome) {
        this.peso = peso;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        public abstract void locomover();
        public abstract void alimentar ();
        public abstract void emitirSom();
}
