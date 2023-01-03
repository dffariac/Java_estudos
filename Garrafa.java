package estudos;
public class Garrafa {
    
    public String marca;
    public String cor;
    public double capacidade;
    private String codigo;

    public double getCapacidade () { // Método get que acessa o atributo
        return this.capacidade;
    }

    public void setCapacidade (double c) { // Método set que modifica o atributo
        this.capacidade = c;
    }
    public String getMarca () {
        return this.marca;
    }

    public void setMarca (String m) {
        this.marca = m;
    }
    public String getCor (){
        return this.cor;
    }
    public void setCor (String co) {
        this.cor = co;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo ( String cod) {
        this.codigo = cod;
    }
     public void status () { // Mostra o status da garrafa
        System.out.println ("Marca: " + this.getMarca());
        System.out.println ("Cor: " + this.getCor());
        System.out.println ("Capacidade: " + this.getCapacidade());
        System.out.println ("Codigo " + this.getCodigo());
     }

    
}

