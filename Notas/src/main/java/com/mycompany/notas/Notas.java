
package com.mycompany.notas;

public class Notas {
    
    public String nome;
    public double Nota1;
    public double Nota2;
    public double Nota3;
    
    public double Total(){
        return Nota1 + Nota2 + Nota3;
    }
    
    public double Restante(){
        return (60 - Total());
    }
}
