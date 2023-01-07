package estudos;
public class Contas {
        public static void main (String[] args) {

     Conta c1 = new Conta();   // Criação de um objeto Conta
     // Chamada dos métodos da classe Conta

     c1.setTitular("Luiz Fernando");
     c1.setNumConta(1234);
     c1.AbrirConta("Conta Corrente");
     c1.Depositar(50);
     c1.Sacar(30);
     c1.pagarMensalidade();
     c1.mostraConta();
    } 
}
