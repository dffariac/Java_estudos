public class Main {
  
    public static Lutador vetorLutador [] = new Lutador [5];
    public static int i;

    public static void main (String[] args) {

        vetorLutador [0]  = new Lutador ("Luiz Fernando", "Brasileiro", 20, 
        55.85f, 1.68f, 10, 0,5);
        
        vetorLutador [1]  = new Lutador ("Anderson Silva", "Brasileiro", 30, 
        59.85f, 1.82f, 10, 0,5);
        
    
        Luta luta1 = new Luta ();

        luta1.MarcarLuta( vetorLutador [0], vetorLutador [1]);
        luta1.Lutar(); 

   for ( i = 0; i < 2; i++) {
            vetorLutador[i].Status();
        }


    }
}
