
package com.mycompany.teste_java;

import entidade.Livro;

public class CadastroLivros {
    
    private Livro[] livros;
    private int quantidadeLivros;

    public CadastroLivros(int tamanho) {
        livros = new Livro[tamanho];
        quantidadeLivros = 0;
    }

    public void cadastrarLivro(Livro livro) {
        if (quantidadeLivros == livros.length) {
            System.out.println("Não é possível cadastrar mais livros.");
            return;
        }
        livros[quantidadeLivros] = livro;
        quantidadeLivros++;
    }

    public void buscarLivro(String titulo) {
        for (int i = 0; i < quantidadeLivros; i++) {
            Livro livro = livros[i];
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void excluirLivro(String titulo) {
        for (int i = 0; i < quantidadeLivros; i++) {
            Livro livro = livros[i];
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                for (int j = i; j < quantidadeLivros - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[quantidadeLivros - 1] = null;
                quantidadeLivros--;
                System.out.println("Livro removido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivros() {
        if (quantidadeLivros == 0) {
            System.out.println("Não há livros cadastrados.");
        } else {
            System.out.println("Lista de livros:");
            for (int i = 0; i < quantidadeLivros; i++) {
                System.out.println(livros[i]);
            }
        }
    }
}
