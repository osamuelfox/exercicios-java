
package entidade;

import excecoes.DominioExcecao;

public class Account {
    
    private int numero;
    private String name;
    private double saldo;
    private double limite;
    private String[] historico;

    public Account(int numero,String name, double saldo, double limite) {
        this.numero = numero;
        this.name = name;
        this.saldo = saldo;
        this.limite = limite;
        this.historico = new String[10];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }
    
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico[getProximaPosicao()] = "Depósito: R$" + valor;
    }
    
    public double consultarSaldo() {
        return saldo;
    }

    public double consultarLimite() {
        return limite;
    }
    
    public void dominio(double valor){
        
        if( valor < getSaldo() ){
            System.out.println("valor " + valor);
            System.out.println("saldo " + saldo);
            throw new DominioExcecao("Saque realizado com sucesso!!!");
            

        }
        if ( valor >= (getSaldo() + getLimite())){
            System.out.println("valor " + valor);
            System.out.println("saldo " + saldo);
            System.out.println("limite " + limite);
            throw new DominioExcecao("Erro: Você excedeu o valor do seu Saldo e limite disponivel em conta");
        }

        if ( valor >= getSaldo()) {
            System.out.println("valor " + valor);
            System.out.println("saldo " + saldo);
            throw new DominioExcecao("Erro: Você excedeu o valor do seu Saldo em conta, voce esta usando o Limite");
        }
        
    }

    public void sacar(double valor) {  
        if (getSaldo() + getLimite() >= valor) {
            saldo -= valor;
            historico[getProximaPosicao()] = "Saque: R$" + valor;
            
            System.out.println("Saque realizado com sucesso");
            
            if ( saldo < 0 ){
                limite = (limite + saldo);
            }
        }
    }
 

    public void consultarExtrato() {
        for (int i = 0; i < historico.length; i++) {
            if (historico[i] != null) {
                System.out.println(historico[i]);
            }
        }
        System.out.println("Saldo em Conta: " + consultarSaldo());
    }

    private int getProximaPosicao() {
        int posicao = 0;
        for (int i = 0; i < historico.length; i++) {
            if (historico[i] == null) {
                posicao = i;
                break;
            }
        }
        return posicao;
    }
}
