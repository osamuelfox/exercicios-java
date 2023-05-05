
package entidade;


public class Programa03 {
    private String Nome;
    private int Idade;
    private double Altura;
    
    public Programa03(String Nome, int Idade, double Altura){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;
    }
    
    public Programa03(String Nome){
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public double getAltura() {
        return Altura;
    }
    
    public static double porcentagemIdade(double somaMenorIdade, int n){
        double porcentagem = (somaMenorIdade/n)*100;
        return porcentagem;
    }
}
