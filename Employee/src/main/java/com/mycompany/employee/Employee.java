package com.mycompany.employee;

public class Employee {
    
    public String Nome;
    public double SalarioBruto;
    public double Taxa;
    public double Porcentagem;
    
    public double NovoSalario(){
        return (SalarioBruto - Taxa );
    }
    
    public double Ajuste() {
        double ajuste = (SalarioBruto / 100 )* Porcentagem;
        return ajuste + NovoSalario();
        
    }
    
    public String toString() {
            return Nome
                    + ", $"
                    + String.format("%.2f", SalarioBruto)
                    + ", "
                    ;
        }    
}
