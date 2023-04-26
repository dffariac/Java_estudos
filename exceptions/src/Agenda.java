import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    List<Contato> agenda = new ArrayList<>();

     public void addContact ( Contato contato) {
        agenda.add(contato);
    }
             public void listeningContact() {
                    for (Contato contato : agenda) System.out.println(contato.toString());
                    System.out.println("Total de contatos na agenda: " + agenda.size());
     }

     public void consultContato() throws contatoNaoExisteException{
            int opcao;
            String resposta = "Sim";
                while (resposta.equalsIgnoreCase("Sim")) {
                    System.out.println("Deseja consultar o contato por qual informação?");
                    System.out.println("1 - Nome \n2 - ID \n3 - Telefone");
                    Scanner sc = new Scanner(System.in);
            try {
                opcao = sc.nextInt();
                if (opcao > 3) {
                    throw new Exception();
                }
            } catch (Exception opcaoInvalida) {
                System.out.println("Opção Inválida!");
                System.out.println("Digite a opção novamente:");
                opcao = sc.nextInt();
            }
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome que deseja pesquisar na agenda: ");
                    String buscaNome = sc.next();
                    for (Contato contato : agenda) {
                        if (contato.getNome().equalsIgnoreCase(buscaNome)) {
                            System.out.println(contato);
                        }
                    }
                    // exceção se o contato não existir
                    throw new contatoNaoExisteException(buscaNome);
                }
                case 2 -> {
                    System.out.println("Digite o ID que deseja pesquisar na agenda: ");
                    int searchID = sc.nextInt();
                    for (Contato contato : agenda) {
                        if (contato.getId() == searchID) {
                            System.out.println(contato);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Digite o numero que deseja pesquisar na agenda: ");
                    String searchNumber = sc.next();
                    for (Contato contato : agenda) {
                        if (contato.getNome().equalsIgnoreCase(searchNumber)) {
                            System.out.println(contato);
                        }

                    }
                }
            }
            System.out.println("Deseja fazer outra consulta?");
            resposta = sc.next();
        }
    }
    public void deleteContact() {
         Scanner scan = new Scanner (System.in);
            listeningContact();
                try { System.out.println("Digite o id do contato que deseja remover:");
                     int remover = scan.nextInt();
                        agenda.remove(remover);
                             //scan.close();
                }
                catch (IndexOutOfBoundsException erro) {
                    System.out.println("Contato não existe na agenda");
                    System.out.println(erro.getMessage());
                    erro.printStackTrace();

                }
    }
}
