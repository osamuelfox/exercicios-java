package com.mycompany.banco;

public class Banco {
    
    private int numConta;
    private double Deposito;
    private String Nome;
    private double Saldo;
    private double DepositoInicial;
        
    public Banco(int numConta, String Nome) {
        this.numConta = numConta;
        this.Nome = Nome;
    }
    
    public Banco(int numConta, double depositoInicial, String Nome) {
        this.numConta = numConta;
        this.Nome = Nome;
        deposit(depositoInicial);
    }
    
    public double getnumConta() {
        return numConta;
    }
    
    public double getDeposito() {
        return Deposito;
    }
    
    public double setDeposito(double Deposito) {
        return this.Deposito;
    }
    
    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public double getSaldo(){
        return Saldo;
    }
    
    public void deposit(double amount){
        Saldo += amount;
    }
    
    public void Saque(double amount){
        Saldo -= amount + 5.0;
    }
    
    public String toString() {
        return "Account: "
                + numConta
                + ", Holder: "
                + Nome
                + ", Balance: $"
                + String.format("%.2f", Saldo);
    }
}
