package Calculadora;


public class Calculardora_V2 {
    
    public double dolar;
    public double reais;
    public double valorReal;
    public double cotacaoDolar;
    public double cotacaoReal;
    public double taxa = 6;
    public double rendimento;
    public double rendimentoTotal;
    
    public double cotacaoDolar(){
        return reais / dolar;
    }
    
    public double cotacaoReal(){
        return reais * dolar;
    }
    
    public double rendimento(){
        return taxa / 100;
    }
    
    public double rendimentoTotal(){
        return rendimento + cotacaoReal;
    }
    
    
    
}
