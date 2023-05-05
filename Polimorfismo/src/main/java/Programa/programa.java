
package Programa;

import Employee.Funcionarios;
import Employee.terceirizados;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        List<Funcionarios> list = new ArrayList<>();
        
        
        System.out.println("Infome o numero de funcionarios:");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Dados do Funcionarios #" + i);
            System.out.println("Funcionario Terceirizado (s/n):");
            char opcao = sc.next().charAt(0);
            
            System.out.println("Nome do Funcionario:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Quantidade de Horas:");
            int  horas = sc.nextInt();
            System.out.println("Valor Por Hora:");
            double valorHora = sc.nextDouble();
            
            if(opcao == 's'){
                System.out.println("Valor Taxa Adicional:");
                double valorAdicional = sc.nextDouble();
                Funcionarios emp = new terceirizados(valorAdicional, nome, horas, valorHora);
                list.add(emp);
            }
            else {
                Funcionarios emp = new Funcionarios(nome, horas, valorHora);
                list.add(emp);
            }
            
        }   
        
        System.out.println("");
        System.out.println("Pagamentos");
        for(Funcionarios emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.pagamento()));
        }
        
        sc.close();
    }
    
}
