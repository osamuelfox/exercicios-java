
package entidade;


public class Programa08 {
    private double Num;
    private double Par;
    
    public Programa08(double Num){
        this.Num = Num;
    }
    
    public Programa08(double Num, double Par){
        this.Par = Par;
    }

    public double getPar() {
        return Par;
    }

    public double getNum() {
        return Num;
    }
    
    public static double soma(double Num,double soma){
        soma += Num;
        return soma;
    }
    
    public static double media(double soma, int n){
        double media = soma / n;
        return media;   
    }
    
    
    
    
    
}
