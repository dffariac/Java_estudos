public abstract class Pessoa {

    private String name;
    private char sexo;
    private int idade;

    public Pessoa(String name, char sexo, int idade) {
        this.name = name;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniverario (){
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public final String toString() { // O final indica que esse método não pode ser sobrescrito
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}
