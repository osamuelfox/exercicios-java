
package com.mycompany.projetoaula;

public class Produto {
    
    private int id;
    private String nome;
    private String desc;
    
    //Setter

    public void setId(int id) {
        this.id = id;  //Ira mexer somente no atributo
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    //Getter
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }  
}

