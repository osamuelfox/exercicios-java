package Calculadora;

public class Calculadora_V3 {
    public static double IOF = 0.06;
    
    public static double dolarToReal(double quantidade, double precoDolar){
        return quantidade*precoDolar * (1.0 + IOF);
    }}
