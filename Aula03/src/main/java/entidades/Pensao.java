
package entidades;


public class Pensao{
    
    private String nome;
    
    private String email;
    
    
    public Pensao(String nome, String email){
        this.nome = nome;
        
        this.email = email;
    }


    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
    
    public String toString() {
        return nome + ", " + email;  
    }
    
}
