public class Main {
    public static void main(String[] args) {

        Professor p1 = new Professor("Luiz", 'M', 22, 2200.00,"Computação");
        Visitante v1 = new Visitante("Cristiano", 'M', 37);
        Bolsista b1 = new Bolsista("Fernando", 'M', 25,"SP3094","Análise e Desenvolvimento de Sistemas", true, 1900.00);
        Aluno a1 = new Aluno("Luiz Fernando", 'M', 23,"SP3096301", "Ciência da computação", true);
        Tecnico t1 = new Tecnico("Messi", 'M', 35, "30977", "Educação Fisica", true, "3091-SX");

        t1.praticar();
        System.out.println(p1.toString());
        System.out.println(v1.toString());
        System.out.println(b1.toString());
        System.out.println(a1.toString());
        p1.receberAumento(550.00);






    }
}