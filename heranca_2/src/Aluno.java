public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private boolean matriculado;

    public Aluno(String name, char sexo, int idade, String matricula, String curso, boolean matriculado) {
        super(name, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.matriculado = matriculado;
    }

    public String getMatricula() {
        return matricula    ;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado() {
        this.matriculado = true;
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade!");
    }
}
