package Java_Guanabara.Exercicios_Aula9;
import java.util.Scanner;

public class Livro implements ILivro{
    private String autor;
    private String Codigo;
    private String titulo;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro ( String autor, String codigo, String titulo, int totPaginas, Pessoa leitor){

    this.setAutor(autor);
    this.setCodigo(codigo);
    this.setTitulo(titulo);
    this.setTotPaginas(totPaginas);
    this.setAberto(false);
    this.setLeitor(leitor);

    System.out.println("Parabéns! Você acabou de cadastrar um livro");
    }

public String getAutor (){
    return this.autor;
}
public void setAutor ( String autor) {
    this.autor = autor;
}
public String getCodigo (){
    return this.Codigo;
}
public void setCodigo ( String codigo){
    this.Codigo = codigo;
}
public String getTitulo (){
    return this.titulo;
}
public void setTitulo (String titulo) {
    this.titulo = titulo;
}
public int getTotPaginas(){
    return this.totPaginas;
}
public void setTotPaginas ( int totPaginas) {
    this.totPaginas = totPaginas;
}
public int getPagAtual (){
    return this.pagAtual;
}
public void setPagAtual (int pagAtual) {
    this.pagAtual = pagAtual;
}
public boolean getAberto (){
    return this.aberto;
}
public void setAberto (boolean aberto){
    this.aberto = aberto;
}
public Pessoa getLeitor (){
    return this.leitor;
}
public void setLeitor (Pessoa leitor) {
    this.leitor = leitor;
}

@Override
public void Abrir() {
    this.setAberto(true);
}


@Override
public void Fechar() {
    this.setAberto(false);
}


@Override
public void Folear() {
Scanner scan = new Scanner (System.in);
System.out.println("Qual a página atual?");
int p = scan.nextInt();
 this.setPagAtual(p);
    if (this.getPagAtual() > this.getTotPaginas()) {
        System.out.println("Inválido. Numero de página atual, maior que o total de páginas");
    }
scan.close();
}

@Override
public void AvançaPag() {
    this.setPagAtual(this.getPagAtual()+1);
    if ( this.getPagAtual() == this.getTotPaginas()) {
        System.out.println("Parabéns! Você terminou de ler o livro");
    }
}

@Override
public void VoltarPag() {
    this.setPagAtual(this.getPagAtual()-1);

    
}

}
