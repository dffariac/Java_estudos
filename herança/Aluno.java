public class Aluno extends Pessoa {
    
private String matricula;
private String curso;
private boolean matriculado;

    

public Aluno(String nome, int idade, String sexo, String matricula, String curso, boolean matriculado) {
    super(nome, idade, sexo);
    this.matricula = matricula;
    this.curso = curso;
    this.matriculado = matriculado;
}
public String getMatricula() {
    return matricula;
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
public void setMatriculado(boolean matriculado) {
    this.matriculado = matriculado;
} 

    public void cancelarMatricula(){
        if (this.isMatriculado() == true) {
        this.setMatriculado(false);
    }
            else {
            System.out.println("O aluno já está desmatriculado");
            }
}



}
