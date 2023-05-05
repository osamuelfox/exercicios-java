
package entidade;

import java.util.Arrays;

public class Aluno01 {
    
    private String nome;
    private int idade;
    private double[] notas;
    private int[][] matriz;

    public Aluno01(String nome, int idade, double[] notas, int[][] matriz) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
        this.matriz = matriz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularMedia() {
        double soma = 0;
        int quantidade = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 0) {
                soma += notas[i];
                quantidade++;
            }
        }
        return soma / quantidade;
    }

    public int contarNumerosPares() {
        int quantidade = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++ ) {
                if (matriz[i][j] % 2 == 0) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public String toString() {
        return "Aluno: \n" +
                "nome: " + nome + "\n"+
                "idade: " + idade + "\n"+
                "notas: " + Arrays.toString(notas) + "\n"+
                "matriz: " + Arrays.deepToString(matriz);
    }
}
