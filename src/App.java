import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        byte login = 0, acao = 0;
        int senha, log;
        int sAdmin = 123, lAdmin = 123;
        System.out.println("Login:");
        System.out.println("1) Bibliotecário");
        System.out.println("2) Cliente");
        
        login = sc.nextByte();
        

        if (login == 1) {
            do{
            System.out.println("Login: ");
            log = sc.nextInt();

            System.out.println("Senha: ");
            senha = sc.nextInt();

            }while(log != lAdmin || senha != sAdmin);
            
            if (log == lAdmin && senha == sAdmin ) {
                do{
                System.out.println("Seja bem vindo!");
                System.out.println("O que deseja fazer?");
                System.out.println("1) Criar livro.");
                System.out.println("2) Editar livro.");
                System.out.println("3) Ler informações do livro.");
                System.out.println("4) Deletar livro.");
                System.out.println("5) Atualizar informações do livro.");
                System.out.println("0) Sair do programa");
                acao = sc.nextByte();
                switch (acao) {
                    case 1:
                        System.out.println("Livro criado!");
                        break;
                    case 2:
                        System.out.println("Livro editado!");
                        break;
                    case 3:
                        System.out.println("Informações do livros lidas!");
                        break;
                    case 4:
                        System.out.println("Livro deletado!");
                        break;
                    case 5:
                        System.out.println("Livro atualizado!");
                        break;
                    case 0:
                        System.out.println("Volte sempre!");
                        break;
                    default:
                        System.out.println("Digite uma opção válida.");
                        break;
                }
                }while(acao != 0);

            } else {
                System.out.println("Login ou senha incorretos.");
            }
              
            

            }
            else if(login == 2){

                do {
                    System.out.println("Escolha uma das opções:");
                    System.out.println("1) Alugar um livro.");
                    System.out.println("2) Ver livros disponíveis.");
                    System.out.println("0) Sair.");
                    acao = sc.nextByte();
                    switch (acao) {
                        case 1:
                            System.out.println("Livro alugado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Opções de livros.");
                            break;
                        case 0:
                            System.out.println("Obrigado e volte sempre!");
                            break;
                        default:
                            System.out.println("Digite uma opcao válida.");
                            break;
                    }
                } while (acao != 0);
            }
            else{
                System.out.println("Digite uma opcao válida.");
            }
        }
            

    }

