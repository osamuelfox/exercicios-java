
package com.mycompany.listarepeticao;

import java.util.Scanner;


public class Ex04 {
    
    public static void main(String[] args) {
        
        int x = 0,cont = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite X: ");
            x = teclado.nextInt();
        
        while (x > cont){
            
            cont += 1;
            
            if (cont % 2 != 0){
            System.out.println(cont);            
            }
        }
    }
}
