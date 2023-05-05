package com.mycompany.teste_java;

import entidade.Livro;
import com.mycompany.teste_java.CadastroLivros;
import java.util.Scanner;

public class Atividade03 {
    
    public static void main(String[] args) {

        CadastroLivros cadastro = new CadastroLivros(10);
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Buscar livro");
            System.out.println("3 - Excluir livro");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    
                    System.out.println("Digite a editora:");
                    String editora = scanner.nextLine();
                    
                    System.out.println("Digite o ano do livro:");
                    int ano = scanner.nextInt();
                    
                    System.out.println("Digite o numero de copias:");
                    int numCopias = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    cadastro.cadastrarLivro(new Livro(titulo, autor, editora, ano, numCopias));
                    System.out.println("Livro cadastrado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o título do livro:");
                    String tituloBusca = scanner.nextLine();
                    cadastro.buscarLivro(tituloBusca);
                    break;  
                    
                case 3:
                    System.out.println("Excluir livro");
                    System.out.println("Digite o Titulo do livro: ");
                    String livro = scanner.nextLine();
                    cadastro.excluirLivro(livro);
                    break;
  
                case 4:
                    System.out.println("listagem de Livros");
                    cadastro.listarLivros();
                    break;
                case 5: 
                    System.out.println("Obrigado por utilizar a Biblioteca");
                    break;
                default: 
                    System.out.println("Opcao Invalida");
            }
        }
    }
    
}
