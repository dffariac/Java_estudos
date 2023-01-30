public class CaixaSom implements Controlador {
    
    private int volume;
    private boolean conectarAparelho;
    private boolean ligado;


    // Método construtor 

    public CaixaSom () {
        this.setVolume (50);
        this.setConectarAparelho (false);
        this.setLigado(false);
        System.out.println("Parabéns! Você acabou de comprar uma caixa de som");
    }
    // Métodos setters e getters

    public int getVolume () {
        return this.volume;
    }

    public void setVolume (int volume) {
        this.volume = volume;
    }

    public boolean getConectarAparelho () {
        return this.conectarAparelho;
    }

    public void setConectarAparelho (boolean conectado) {
        this.conectarAparelho = conectado;
    }
    public boolean getLigado (){
        return this.ligado;
    }
    public void setLigado (boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
        System.out.println("Caixa de som ligada");
        
    }

    @Override
    public void Desligar() {
        this.setLigado (false);
        System.out.println("Caixa de som desligada");
        
    }

    @Override
    public void AumentarVolume() {
        if (getLigado()) {
        this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void DiminuirVolume() {
       if (this.getLigado()){
        this.setVolume(this.getVolume() - 1);
       }
    }

    @Override
    public void ConectarAparelho() {
        if (this.getLigado()) {
        this.setConectarAparelho(true);
        System.out.println("Aparelho conectado");
        }
    }

    @Override
    public void DesconectarAparelho() {
        if (this.getLigado() && this.getConectarAparelho()) {
            this.setConectarAparelho(false);
            System.out.println("Aparelho desconectado");
        }
        
    }
}
