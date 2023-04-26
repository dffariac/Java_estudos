public class Main {
    public static void main(String[] args) {

        Peixe peixe = new Peixe(20.00,2,"Peixonauta");
        Reptil reptil = new Reptil(12.5,7,"Carlos");
        Mamifero mamifero = new Mamifero(22.5,10,"Willy");
        Ave ave = new Ave(4.76,4, "Marmotinha");

        peixe.alimentar();
        peixe.emitirSom();
        peixe.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.locomover();
        reptil.emitirSom();
        reptil.alimentar();
        reptil.locomover();
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();

    }
}