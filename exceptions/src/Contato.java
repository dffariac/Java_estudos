public class Contato {

    private String nome;
    private int id;
    private String telefone;
    private static int contador = 0;

    public Contato (String nome, String telefone) {
        contador++; // Incrementado toda vez que um contato é criado
        id = contador;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Id " + this.getId() + " | " + this.getNome() + " | " + this.getTelefone();
    }
}
