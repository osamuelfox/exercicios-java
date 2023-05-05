
package entidade;

public class Conta {
    
    private Integer conta;
    private String titular;
    protected Double saldo;
    
    public Conta(){
    
    }

    public Conta(Integer conta, String titular, Double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void saque(double quantidade){
        saldo -= quantidade;
    }
    
    public void deposito(double quantidade){
        saldo += quantidade;
    }
}
