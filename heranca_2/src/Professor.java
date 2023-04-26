public class Professor extends  Pessoa{
    private double salario;
    private String especialidade;

    public Professor(String name, char sexo, int idade, double salario, String especialidade) {
        super(name, sexo, idade);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberAumento(double aumento){
        this.setSalario(this.getSalario()+aumento);
        System.out.println("O novo salário de: " + this.getName() + " é " + this.getSalario());
    }
}
