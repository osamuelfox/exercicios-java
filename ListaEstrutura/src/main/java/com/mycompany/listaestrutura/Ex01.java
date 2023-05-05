
package com.mycompany.listaestrutura;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        int num;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        num = teclado.nextInt();
        
        /*
        if (num < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }*/
        
        String cond = (num < 0) ? "NEGATIVO" : "NAO NEGATIVO";
        System.out.println(cond);
        
        teclado.close();

        
    }
    
}
