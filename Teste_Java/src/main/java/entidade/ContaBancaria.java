
package entidade;

public class ContaBancaria {
    
    private int numero;
    private double saldo;
    private double limite;
    private String[] historico;

    public ContaBancaria(int numero, double saldo, double limite) {
        
        

        this.numero = numero;
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

    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            historico[getProximaPosicao()] = "Saque: R$" + valor;
            
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarLimite() {
        return limite;
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
