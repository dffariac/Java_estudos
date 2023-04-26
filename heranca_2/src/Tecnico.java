public class Tecnico extends Aluno{

    private String registroProfissional;

    public Tecnico(String name, char sexo, int idade, String matricula, String curso, boolean matriculado, String registroProfissional) {
        super(name, sexo, idade, matricula, curso, matriculado);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar (){
        System.out.println(this.getName() + " está praticando");

    }

}

