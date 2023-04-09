public class Main {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Luiz", 21, "Masculino", "SP3095", "Análise e Desenvolvimento de Sistemas", true);
        Professor p1 = new Professor("Fernando", 30, "Masculino", "Computação", 1200.00);
        Funcionario f1 = new Funcionario("Farias", 22, "Masculino", "Banda larga", true);
    
    System.out.println(a1.toString());
    a1.cancelarMatricula();
     
    System.out.println(p1.toString());
     
    System.out.println(f1.toString());

    
    
}



}
