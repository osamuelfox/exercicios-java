
package com.mycompany.aventura;


public class Aventura {

    public static void main(String[] args) {
        
        Item itens = new Item(1, "Filme", "Descricaooooooo");
        
        Sala abc = new Sala(2,"Um filme aleatorio, que contava uma historia aleatoria sobre um cara foda.");
        
        
        System.out.println("Nome " + itens.getNome() + "\nDescricao " + itens.getDescricao());
        System.out.println("Descricao do Filme " + abc.getDescricao());
    }
}
