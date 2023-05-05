
package entidade;


public class Programa09 {
    private String Nome;
    private int Idade;
    
    public Programa09(String Nome){
        this.Nome = Nome;

    }
    
    public Programa09(int Idade){
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }
    
}
