public class contatoNaoExisteException extends Exception{
    private String nomeContato;

    public contatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return nomeContato + " não existe na lista";
    }
}
