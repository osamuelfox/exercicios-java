

package com.mycompany.rectangle;


public class Rectangle {
    
    public double Altura;
    public double Largura;

    public double Area(){
        return (Altura * Largura);
    }
    public double Perimetro(){
        return (2 * (Altura + Largura));
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(Altura, 2) + Math.pow(Largura, 2));
        
    }
}
