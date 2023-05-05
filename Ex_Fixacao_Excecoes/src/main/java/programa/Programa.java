
package programa;

import entidade.Account;
import excecoes.DominioExcecao;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
              
            System.out.println("Bem-Vindo ao Banco xyz");
            System.out.println("");

            System.out.println("Digite o número da conta: ");
            int numeroConta = sc.nextInt();
            
            System.out.println("Digite o nome: ");
            String nome = sc.next();

            System.out.println("Digite o saldo inicial: ");
            double saldoInicial = sc.nextDouble();

            System.out.println("Digite o limite de crédito: ");
            double limiteCredito = sc.nextDouble();

            Account conta = new Account(numeroConta, nome, saldoInicial, limiteCredito);

            int opcao = 0;

            while (opcao != 6) {
                System.out.println("\nDigite a opção desejada:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Consultar saldo");
                System.out.println("4 - Consultar limite");
                System.out.println("5 - Consultar extrato");
                System.out.println("6 - Sair");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado: ");
                        double valorDeposito = sc.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso.");
                        break;

                    case 2: 
                        System.out.println("Digite o valor a ser sacado: ");
                        double valorSacar= sc.nextDouble();
                        conta.dominio(valorSacar);
                        conta.sacar(valorSacar);
                        

                        break;

                    case 3:
                        System.out.println("Saldo em conta: ");
                        System.out.println(conta.consultarSaldo());

                        break;

                    case 4:
                        System.out.println("Seu limite: ");

                        System.out.println(conta.consultarLimite());

                        break;
                    case 5: 
                        System.out.println("Seu Extrato: ");
                        conta.consultarExtrato();

                        break;

                    case 6: 
                        System.out.println("Fim");
                        break;
                }
                
            }
            
        }
        
        catch (DominioExcecao e){
            System.out.println(e.getMessage());
            
        }
        catch (RuntimeException e ){
            System.out.println("Erro inesperado");
        }
        
    } 
}
 