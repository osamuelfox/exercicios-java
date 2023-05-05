
package com.mycompany.listarepeticao;

import java.util.Scanner;

 class Ex01 {
    public static void main(String[] args) {
         
        int senha;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        senha = teclado.nextInt();
         
        while(senha != 2002){
            System.out.println("Senha Invalida");
            
            System.out.print("Digite a senha: ");
            senha = teclado.nextInt();
             
        }
        if (senha == 2002){
            System.out.println("Acesso permitido");
        }
        
        teclado.close();
 
    }
    
}
