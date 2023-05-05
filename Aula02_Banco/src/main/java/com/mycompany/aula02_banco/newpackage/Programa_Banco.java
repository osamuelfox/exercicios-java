
package com.mycompany.aula02_banco.newpackage;

import com.mycompany.banco.Banco;
import java.util.Locale;
import java.util.Scanner;

public class Programa_Banco {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Banco banco;
        
        System.out.println("Numero da conta: ");
        int numConta = sc.nextInt();
        
        System.out.println("Nome da conta: ");
        String Nome = sc.next();
        
        System.out.println("Deseja fazer um deposito inicial (s/n)? " );
        String des = sc.next();
        
        if (des.equals("s") ){
            
            System.out.println("Deposito inicial:");
            double Deposito = sc.nextDouble();
            
            while(Deposito < 0){
                System.out.println("O deposito nao pode ser negativo");
                System.out.println("");
                System.out.println("Deposito inicial:");
                Deposito = sc.nextDouble();
                
            }
            banco = new Banco(numConta, Deposito, Nome);
        }else {
            banco = new Banco(numConta, Nome);
        }
        
        System.out.println("");
        System.out.println(banco);
        
        System.out.println("Deposito: ");
        double Deposito = sc.nextDouble();
        banco.deposit(Deposito);
        
        System.out.println("");
        System.out.println(banco);
        
        System.out.println("Saque: ");
        double Saque = sc.nextDouble();
    
        banco.Saque(Saque);
        
        System.out.println("");
        System.out.println(banco);
        
        sc.close();
    }
}
