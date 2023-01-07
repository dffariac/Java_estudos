package estudos;

public class Conta {

// Atributos da Classe
public int numConta;
public String titular;
private double saldo;
public boolean status;
protected  String tipoConta;

// Métodos setters e getters

public int getNumConta() {
    return this.numConta;
}
public void setNumConta( int NumConta) {
    this.numConta = NumConta;
}
public String getTitular() {
    return this.titular;
}
public void setTitular(String Titular) {
    this.titular = Titular;
}

private double getSaldo() {
    return this.saldo;
}
private void setSaldo(double Saldo) {
    this.saldo = Saldo;

}
public boolean getStatus(){
    return this.status;
}
public void setStatus (boolean Status){
    this.status = Status;
}

public String getTipoConta(){
    return this.tipoConta;
}
public void setTipoConta ( String TipoConta) {
    this.tipoConta = TipoConta;
}

// Método Construtor 
public Conta (){ // Conta inicia fechada e com saldo
    this.setStatus (false);
    this.setSaldo(0);
}

// Métodos especiais

public void AbrirConta(String TipoConta) { // Método que abre conta
    setStatus(true);
    setTipoConta(TipoConta); // Paramêtro passado na definição do método
   
        if ( this.getTipoConta() == "Conta Poupança") {
            System.out.println("Parabéns você abriu uma conta poupança!");
            System.out.println("Você ganhou R$ 150,00 de bônus");
            this.setSaldo(150.0);

        }
        else {
            System.out.println("Parabéns você abriu uma conta corrente!");
            System.out.println("Você ganhou R$ 50,00 de bônus");
            this.setSaldo(50.0);

        } 
}

public void FecharConta(){
    if(this.getStatus() == true && this.getSaldo() == 0){
        System.out.println("Você pode fechar a sua conta");
        setStatus(false);
    }
    else if (this.getStatus() == true && this.getSaldo() < 0) {
        System.out.println("Você tem valores pendentes, não pode fechar sua conta");
    }
    else if (this.getStatus() == true && this.getSaldo() > 0) {
        System.out.println("Você tem valores a sacar, não pode fechar sua conta");
    }
}

public void Depositar (double Saldo) {
    if ( getStatus() == true) {
        setSaldo(getSaldo()+ Saldo);
    }
}

public void Sacar (double Saldo) {
    if (getStatus() == true && getSaldo() >= Saldo ){
        setSaldo(getSaldo()- Saldo);
    }
    else {
        System.out.println("Você não pode sacar");
    }

}

public void pagarMensalidade() { // Método para pagar mensalidade

    if (getStatus()) {
    if (getTipoConta() == "Conta Poupança") {
        setSaldo(getSaldo() - 20);
    }
    else if (getTipoConta() == "Conta Corrente") {
        setSaldo(getSaldo()- 12);
    }
}
} // Fim metodo pagarMensalidade

public void mostraConta() { // Mostra as informações da conta
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo de Conta: " + this.getTipoConta());
    
} // Fim mostraConta
} // Fim da Classe Conta