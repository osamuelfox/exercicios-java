package com.mycompany.projetoconstrutor;

public class ProjetoConstrutor {

    public static void main(String[] args) {
        Pessoa pes1 = new Pessoa("Samuel", 19);
        
        System.out.println("Nome: " + pes1.getNome() + "\nIdade: " + pes1.getIdade());
    }
}
