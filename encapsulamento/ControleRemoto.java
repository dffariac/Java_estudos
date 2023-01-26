package Java_Guanabara.encapsulamento;
import java.util.Scanner;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int opcao;

// método construtor

    public ControleRemoto () {
        this.setVolume(50); // Controle começa com 50 de volume
        this.setLigado(false);
        this.setTocando(false);
    }
//metodos setters e getters 

    public int getVolume (){
    return this.volume;
    }

    public void setVolume( int volumeLocal) {
    this.volume = volumeLocal;
    }
    public boolean getLigado() {
    return this.ligado; 
    }   

    public void setLigado( boolean ligadoLocal) {
    this.ligado = ligadoLocal;
    }
    public boolean getTocando() {
        return this.tocando;
    }
    public void setTocando (boolean tocandoLocal) {
        this.tocando = tocandoLocal;
    }
    public int getOpcao () {
        return this.opcao;
    }
    public void setOpcao (int opcaoLocal) {
        this.opcao = opcaoLocal;
    }

// Métodos especiais 
    @Override // Implementa a interface
    public void Ligar() {
    this.setLigado(true);
        
    }

    @Override
    public void Desligar() {
    this.setLigado(false);
        
    }

    @Override
    public void AumentarVolume() {
        if ( getLigado()) {
       this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void DiminuirVolume() {
    if (getLigado()) {
        this.setVolume(this.getVolume() - 1);
    } 
        
    }

    @Override
    public void MostrarMenu() {
        if ( getLigado()) {
            System.out.println("----- MENU -------");
            System.out.println("Ligado? " + this.getLigado());
            System.out.println("Tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
        }
       
        
    }

    @Override
    public void Aplicativos() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o aplicativo que deseja acessar");
        System.out.println("[1] Netflix \n[2] Youtube");
        this.opcao = scan.nextInt();
        this.setOpcao(opcao);
        scan.close();
        if (this.getLigado()) {
            switch (opcao) {
                case 1: 
                System.out.println("Abrindo Netflix..");
                break;
            
                case 2: 
                System.out.println("Abrindo Youtube..");
                break;

                default:
                System.out.println("Comando Inválido");
        }
    }
    else {
        System.out.println("O controle está desligado.");
    }
}

}
