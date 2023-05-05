
package com.mycompany.listaestrutura;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        double x, y;
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        x = teclado.nextDouble();
        
        System.out.print("Digite o numero: ");
        y = teclado.nextDouble();
        
        if (x > 0 && y > 0 ){
            System.out.println("Q1");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        }else if (x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x == 0 && y == 0){
            System.out.println("Origem"); 
        }
        teclado.close();
 
    }
    
}
