
package com.mycompany.listarepeticao;

import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        
        Scanner teclado = new Scanner(System.in);
       
        
        while(x != 0 || y != 0){
            System.out.print("Digite X: ");
            x = teclado.nextInt();
        
            System.out.print("Digite Y: ");
            y = teclado.nextInt();
            
            if (x == 0 || y == 0){
                System.out.println("FIM");
                break;  
            } else if (x > 0 && y > 0 ){
                System.out.println("Primeiro");   
            }else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }else if (x < 0 && y < 0){
                System.out.println("Terceiro");
            }
        }
        
        teclado.close();
    
    }
    
}
