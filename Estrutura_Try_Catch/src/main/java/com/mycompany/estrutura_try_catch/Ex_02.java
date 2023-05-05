
package com.mycompany.estrutura_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            
            System.out.println(vetor[posicao]);
 
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Posicao invalida!!");
        
        }
        
        catch(InputMismatchException e){
            System.out.println("Erro na entrada de dados!!");
            
        }
        
        System.out.println("Programa Encerrado!!");
        
        sc.close();
    }
    
}
