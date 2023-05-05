
package com.mycompany.projetoaula;

public class Projeto00 {
    
    public static void main(String[] args) {
    
    Produto p;
    p = new Produto();
    p.setId(1);
    p.setNome("O senhor dos Aneis");
    p.setDesc("Maior classico da literatura de fantasia");
    
        System.out.println("ID:  " + p.getId());
        System.out.println("Nome:  " + p.getNome());
        System.out.println("Desc:  " + p.getDesc());
            
    }
    
}
