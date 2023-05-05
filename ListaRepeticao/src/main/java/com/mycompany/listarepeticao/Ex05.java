
package com.mycompany.listarepeticao;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        int N = 0, cont = 0, num, in = 0, out = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de repeticoes: ");
        N = teclado.nextInt();
       
        while (N > cont){
            System.out.print("Digite um numero: ");
            num = teclado.nextInt();

            cont += 1;
            
            if (num >= 10 && num <= 20){
                in += 1;
                 
            }else{
                out += 1;
            }
        }
        System.out.println( in + " in\n" + out + " out");
    }
    
    
    
}
