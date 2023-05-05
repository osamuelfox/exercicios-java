
package com.mycompany.mercado;

public class Mercado {
        
    private String Nome;
    private double Preco;     
    private int Quantidade;

    public Mercado() {

    }

    public Mercado(String Nome, double Preco, int Quantidade){
        this.Quantidade = Quantidade;
        this.Preco = Preco;
        this.Quantidade = Quantidade;
    }

    public Mercado(String Nome, double Preco) {

        this.Nome = Nome;
        this.Preco = Preco;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public double valorTotalEstoque(){
        return Preco * Quantidade;
    }

    public void addProdutos(int Quantidade) {
        this.Quantidade += Quantidade;
    }

    public void removerProdutos(int Quantidade){
        this.Quantidade -= Quantidade;
    }

    public String toString() {
        return Nome
                + ", $"
                + String.format("%.2f", Preco)
                + ", "
                + Quantidade
                + " unidade, Total: $ "
                +String.format("%.2f", valorTotalEstoque());
    }
}
