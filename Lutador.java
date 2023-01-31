
public class Lutador implements ILutador {
    
private String nome;
private String nacionalidade;
private String categoria;
private int idade;
private float peso;
private float altura;
private int vitorias;
private int derrotas;
private int empates;

// Método construtor

public Lutador (String nomeLutador, String nacionalidadeLutador, int idadeLutador,
float pesoLutador, float alturaLutador, int vitoriasLutador, int derrotasLutador,
int empatesLutador ) {

this.setNome(nomeLutador);
this.setNacionalidade(nacionalidadeLutador);
this.setIdade(idadeLutador);
this.setPeso(pesoLutador);
this.setAltura(alturaLutador);
this.setVitorias(vitoriasLutador);
this.setDerrotas(derrotasLutador);
this.setEmpates(empatesLutador);
System.out.println("Parabéns! Bem vindo " + this.getNome() + " a competição");
}

// Métodos getters e setters

public String getNome () {
    return this.nome;
}

public void setNome ( String nomeSet) {
this.nome = nomeSet;
}

public String getNacionalidade () {
    return this.nacionalidade;
}

public void setNacionalidade (String nacionalidadeSet) {
    this.nacionalidade = nacionalidadeSet;
}
public int getIdade () {
    return this.idade;
}
public void setIdade ( int idadeSet) {
    this.idade = idadeSet;
}
public float getPeso () {
    return this.peso;
}
public void setPeso (float pesoSet) {
    this.peso = pesoSet;
    this.setCategoria();

}
public float getAltura  () {
    return this.altura;
}
public void setAltura (float alturaSet) {
    this.altura = alturaSet;
}
public String getCategoria () {
    return this.categoria;
}
public void setCategoria () {
    if (getPeso() < 52.7 ) {
    this.categoria = "Inválido";
    }
    else if (getPeso() <=70.3) {
        this.categoria = "Pena";
    }
    else if (getPeso() <= 83.9) {
        this.categoria = "Médio";
    }
    else if (getPeso() <= 103.5) {
        this.categoria = "Pesado";
    }
    else {
        this.categoria = "Inválido";
    }
}

public int getVitorias () {
    return this.vitorias;
}
public void setVitorias ( int vitoriasSet) {
    this.vitorias = vitoriasSet;
}
public int getDerrotas () {
    return this.derrotas;
}
public void setDerrotas (int derrotasSet) {
    this.derrotas = derrotasSet;
}
public int getEmpates () {
    return this.empates;
}
public void setEmpates (int empatesSet) {
    this.empates = empatesSet;
}
// Métodos especiais

@Override
public void Apresentar() {
    System.out.println("Nome:" + this.getNome());
    System.out.println("Idade:" + this.getIdade());
    System.out.println("Nacionalidade: " + this.getNacionalidade());
    System.out.println("Peso: " + this.getPeso());
    System.out.println("Altura: " + this.getAltura());
    
}

@Override
public void Status() {
    System.out.println("Nome:" + this.getNome());
    System.out.println("Categoria:" + this.getCategoria());
    System.out.println("Vitórias:" + this.getVitorias() + " Derrotas:" + this.getDerrotas() + " Empates:" + this.getEmpates());  
}

@Override
public void GanharLuta() {
   this.setVitorias(this.getVitorias() + 1);
    
}

@Override
public void EmpatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
}

@Override
public void PerderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
    
}

} // Fim da classe Lutador 



