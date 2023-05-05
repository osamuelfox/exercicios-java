
package Programa;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class programa {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        List<Conta> list = new ArrayList<>();
        
        list.add(new ContaPoupanca(1001,"Alex",500.00,0.01));
        
        list.add(new ContaEmpresa(1002, "Maria", 1000.0, 400.0));
        
        list.add(new ContaPoupanca(1004,"Bob",300.00,0.01));
         
        list.add(new ContaEmpresa(1005, "Anna", 500.0, 500.0));

        double soma = 0.0;
        
        for(Conta acc : list){
            soma += acc.getSaldo();
        }
        
        System.out.printf("Saldo total: %.2f%n",soma);
        
        for(Conta acc : list){
            acc.deposito(10.0);
        }
        for(Conta acc : list){
            System.out.printf("Saldo da conta atualizao %d: %.2f%n", acc.getConta() ,acc.getSaldo());
        }
    }
}
