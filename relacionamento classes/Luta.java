import java.util.Random;
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

// Métodos setters e getters
    public Lutador getDesafiado (){
        return this.desafiado;
    }
    public void setDesafiado ( Lutador desafiadoSet){
        this.desafiado = desafiadoSet;
    }
    public Lutador getDesafiante (){
        return this.desafiante;
    }
    public void setDesafiante (Lutador desafianteSet) {
        this.desafiante = desafianteSet;
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds (int roundsSet) {
        this.rounds = roundsSet;
    }
    public boolean getAprovada (){
        return this.aprovada;
    }
    public void setAprovada ( boolean aprovadaSet) {
        this.aprovada = aprovadaSet;
         
    }


// Metodos especiais 

    public void MarcarLuta(Lutador l1, Lutador l2) {
        if ( l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }

    public void Lutar () {
if (this.getAprovada()) {
    System.out.println("-------------");
    this.desafiado.Apresentar();
    System.out.println("-------------");
    this.desafiante.Apresentar();
    
    Random aleatorio = new Random ();
    int vencedor = aleatorio.nextInt(3);
    
    switch (vencedor) {

        case 0:
        System.out.println ("Empatou");
        this.getDesafiado().EmpatarLuta();
        this.getDesafiante().EmpatarLuta();
        break;

        case 1: // Desafiado vence a luta
        this.getDesafiado().GanharLuta();
        this.getDesafiante().PerderLuta();
        System.out.println(this.desafiado.getNome() + "venceu a luta");
        break;

        case 2: // Desafiado vence a luta
        this.getDesafiante().GanharLuta();
        this.getDesafiado().PerderLuta();
        System.out.println(this.desafiante.getNome() + "venceu a luta");
        break;

    }

}
    }
}
