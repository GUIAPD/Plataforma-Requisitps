import controller.DocumentoController;
import controller.LoginController;
import controller.ProjetoController;
import controller.RequisitoController;
import java.util.Scanner;
import model.Documento;
import model.Projeto;
import model.Requisito;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LoginController login =
                new LoginController();

        System.out.println("=== LOGIN ===");

        System.out.print("Usuario: ");
        String usuario =
                sc.nextLine();

        System.out.print("Senha: ");
        String senha =
                sc.nextLine();

        if(login.entrar(usuario, senha)) {

            System.out.println("Login realizado!");

            ProjetoController projetoController =
                    new ProjetoController();

            RequisitoController requisitoController =
                    new RequisitoController();

            DocumentoController documentoController =
                    new DocumentoController();

            int opcao = 0;

            while(opcao != 7){

                System.out.println(""" 
        
                ╔══════════════════════════════════════╗
                ║      PLATAFORMA DE REQUISITOS        ║
                ╠══════════════════════════════════════╣
                ║ 1 - Cadastrar Projeto                ║
                ║ 2 - Listar Projetos                  ║
                ║ 3 - Cadastrar Requisito              ║
                ║ 4 - Listar Requisitos                ║
                ║ 5 - Cadastrar Documento              ║
                ║ 6 - Listar Documentos                ║
                ║ 7 - Sair                             ║
                ╚══════════════════════════════════════╝
                """); 
                System.out.print("Opcao: ");

                opcao =
                        Integer.parseInt(
                                sc.nextLine());

                switch(opcao){

                    case 1:

                        System.out.print(
                                "Nome do Projeto: ");

                        String nome =
                                sc.nextLine();

                        System.out.print(
                                "Descricao: ");

                        String descricao =
                                sc.nextLine();

                        Projeto projeto =
                                new Projeto(
                                        0,
                                        nome,
                                        descricao);

                        projetoController.cadastrar(
                                projeto);

                        break;

                    case 2:

                        projetoController
                                .listar()
                                .forEach(
                                        System.out::println);

                        break;

                    case 3:

                        System.out.print(
                                "Descricao do requisito: ");

                        String descReq =
                                sc.nextLine();

                        Requisito requisito =
                                new Requisito(
                                        0,
                                        descReq);

                        requisitoController.cadastrar(
                                requisito);

                        break;

                    case 4:

                        requisitoController
                                .listar()
                                .forEach(
                                        System.out::println);

                        break;

                    case 5:

                        System.out.print(
                                "Titulo: ");

                        String titulo =
                                sc.nextLine();

                        System.out.print(
                                "Conteudo: ");

                        String conteudo =
                                sc.nextLine();

                        Documento documento =
                                new Documento(
                                        titulo,
                                        conteudo);

                        documentoController.cadastrar(
                                documento);

                        break;

                    case 6:

                        documentoController
                                .listar()
                                .forEach(
                                        System.out::println);

                        break;

                    case 7:

                        System.out.println(
                                "Sistema encerrado.");

                        break;

                    default:

                        System.out.println(
                                "Opcao invalida.");
                }
            }

        } else {

            System.out.println(
                    "Login invalido!");
        }

        sc.close();
    }
}