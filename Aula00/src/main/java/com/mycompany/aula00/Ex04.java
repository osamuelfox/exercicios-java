
package com.mycompany.aula00;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
     public static void main(String[] args) {
         
        String x; 
        int y;
        double z;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma String: ");
        x = teclado.next();
        
        System.out.print("Digite um numero: ");
        y = teclado.nextInt(); 
        
        
        
        System.out.print("Digite um numero com virgula: ");
        z = teclado.nextDouble();
        
        
        System.out.printf("%nString: %s%nInteiro: %d %nDouble: %f %n",x , y, z);

     }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}
