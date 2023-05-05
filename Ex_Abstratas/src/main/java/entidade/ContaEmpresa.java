
package entidade;

public class ContaEmpresa extends Conta{
    
    private Double limiteEmprestimo;
    
    public ContaEmpresa(){
        super();
    }

    public ContaEmpresa(Integer conta, String titular, Double saldo, Double limiteEmprestimo) {
        super(conta, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void emprestimo(double quantidade){
        if( quantidade <= limiteEmprestimo ){
            saldo += quantidade - 10.0;
        }
    }  
}
