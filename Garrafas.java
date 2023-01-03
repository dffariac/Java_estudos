package estudos;

public class Garrafas {
 
    public static void main ( String [] args) {

    Garrafa g1 = new Garrafa(); // Craiação do objeto garrafa

    g1.setMarca ("Tupperware"); // Modificaçao do atributo pelo metodo set
    g1.setCapacidade(0.5f);
    g1.setCor("Vermelha");
    g1.setCodigo("CX091");
    g1.status(); // Chamada do método para mostrar o status do objeto
        
}
}