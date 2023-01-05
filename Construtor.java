package estudos;

public class Construtor {
// Atributos da classe
public String marcaTelefone;
public String modelo;
public String sistemaOPeracional;
public float valor; 

        // Método construtor
        public Construtor ( String marca, String modelo, String SO, float valor) { // Paasagem de parâmetro
        this.setMarcaTelefone(marca);
        this.setModelo( modelo);
        this.setSistemaOperacional(SO);
        this.setValor(valor);
        
        this.MostraStatus();
        
        }
        
        // Métodos getters e setters
        public String getMarcaTelefone() {
        return this.marcaTelefone;}

        public void setMarcaTelefone (String marca) {
        this.marcaTelefone = marca;} 

        public String getModelo(){
        return this.modelo;}

        public void setModelo (String modelo) {
            this.modelo = modelo;}
        
        public String getSistemaOperacional(){
            return this.sistemaOPeracional; }

        public void setSistemaOperacional(String SO){
            this.sistemaOPeracional = SO;}
        
        public float getValor () {
            return this.valor; }

        public void setValor (float valor) {
            this.valor = valor;
        }

        // Métodos especiais
        public void MostraStatus () {
            System.out.format ("Modelo: %s\n Marca: %s\nSistema Operacional: %s \nValor: %f \n", this.getModelo(), this.getMarcaTelefone(), this.getSistemaOperacional(), this.getValor());
        }
    
}



