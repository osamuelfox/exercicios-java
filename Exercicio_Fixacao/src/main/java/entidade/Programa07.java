
package entidade;


public class Programa07 {
    private double Num;
    
    public Programa07 (double Num){
        this.Num = Num;
    }
    
    public static double soma(double Num,double soma){
        soma += Num;
        return soma;
    }
    
    public static double media(double soma, int n){
        double media = soma / n;
        return media;
    }

    public double getNum() {
        return Num;
    }
    
    
    
   
    
}
