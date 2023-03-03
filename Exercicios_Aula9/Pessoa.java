package Java_Guanabara.Exercicios_Aula9;

public class Pessoa {
    
    private String nome;
    private String usuario;
    private String sexo;
    private int idade;

    // metodos getters e setters

    public String getNome (){
        return this.nome;
    }
    public void setNome( String nome) {
        this.nome = nome;
    }
    public String getUsuario (){
        return this.usuario;
    }
    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade (int idade) {
        this.idade  = idade;
    }

    // Metodos especiais
    public void FazerAniver (){
        this.setIdade(this.getIdade()+1);
    }

}
