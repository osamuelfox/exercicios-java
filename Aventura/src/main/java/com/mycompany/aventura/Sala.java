
package com.mycompany.aventura;

public class Sala {
    
    private int id;
    private String descricao;
    
    public Sala(int id, String descricao){
        
        this.id = id;
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    

}
