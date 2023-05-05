
package entidade;

public class Programa10 {
    
    private String Nome;
    private double Nota1b;
    private double Nota2b;
    
    public Programa10(String Nome, double Nota1b, double Nota2b){
        this.Nome = Nome;
        this.Nota1b = Nota1b;
        this.Nota2b = Nota2b;
    }
    
    public Programa10(double Nota1b, double Nota2b){
        this.Nota1b = Nota1b;
        this.Nota2b = Nota2b;
    }
    
    

    

    public double media(double Nota1b, double Nota2b){
        return (Nota1b + Nota2b) / 2;
        
    }

    public String getNome() {
        return Nome;
    }

    public double getNota1b() {
        return Nota1b;
    }

    public double getNota2b() {
        return Nota2b;
    }
    
    
    
}
