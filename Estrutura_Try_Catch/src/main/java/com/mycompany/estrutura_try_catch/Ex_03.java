
package com.mycompany.estrutura_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_03 {
    
    public static void main(String[] args) {
        metodo1();
        
        System.out.println("Programa Encerrado");
    }
    
    public static void metodo1 (){
        
        System.out.println("+++ Inicio metodo 1 +++");
        metodo2();
        System.out.println("+++ Fim metodo 2 +++");
    }
    
    public static void metodo2() {
        System.out.println("+++ Inicio metodo 2 +++");
        
        Scanner sc = new Scanner(System.in);
        try{
            
        String[] vetor = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        
        System.out.println(vetor[posicao]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posicao invalida");
            e.printStackTrace();
            sc.next();
            
        }
         catch(InputMismatchException e) {
             System.out.println("Erro na entrada de dados");
         }
         sc.close();
         System.out.println("+++Fim metodo 2+++");
        
        
        
    }
}
