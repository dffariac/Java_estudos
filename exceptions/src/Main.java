import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws contatoNaoExisteException {

        Contato c1 = new Contato("Luiz", "11953050549");
        Contato c2 = new Contato("Mario", "1111111111");
        Contato c3 = new Contato("Thiago", "123456789");
        Agenda a1 = new Agenda();

        int escolha = menu(scan);
        if (escolha == 1) { // Adicionar contato
            a1.addContact(c1);
            a1.addContact(c2);
            a1.addContact(c3);

        }
        else if (escolha == 2){ // Remover Contato
            a1.deleteContact();
        }
        else if (escolha == 3){ // Listar Contato
            a1.listeningContact();
        }
        else if (escolha == 4){ // Buscar Contato
        a1.consultContato();
        }
        else if (escolha == 5){ // Sair
            System.out.println("Você está saindo da agenda");
        }

        }

        public static int menu (Scanner scan){
            int opcao = 5;
            boolean opcaoVerificada = false;
            while (!opcaoVerificada) {
                System.out.println("------------------");
                System.out.println("Digite a opção do que deseja fazer na agenda");
                System.out.println("1- Cadastro contato\n " +
                        "2 - Remover contato \n " +
                        "3 - Listar contato \n " +
                        "4 - Buscar conato \n" +
                        "5 - Sair da agenda");
                try {
                    opcao = scan.nextInt();
                    if (opcao > 5 || opcao < 1) {
                        throw new Exception("Você digitou uma opção inválida");
                    } else {
                        opcaoVerificada = true;
                    }
                } catch (Exception exception) {
                    System.out.println("Entrada inválida, digite novamente");
                }
            }
            return opcao;
        }


    }





