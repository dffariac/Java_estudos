public class Bolsista extends Aluno{

    private double bolsa;

    public Bolsista(String name, char sexo, int idade, String matricula, String curso, boolean matriculado, double bolsa) {
        super(name, sexo, idade, matricula, curso, matriculado);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    public void renovarBolsa(){

    }

    @Override
    public void pagarMensalidade() { // Sobrescrevendo o método da classe super
        System.out.println(this.getName()+" é bolsista. O pagamento é facilitado.");;
    }
}
