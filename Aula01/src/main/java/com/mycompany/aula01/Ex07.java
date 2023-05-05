
package com.mycompany.aula01;

import java.util.Locale;
import java.util.Scanner;


public class Ex07 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        double n1, n2, n3, area;
        
        System.out.println("Triangulo1: ");
        Scanner sc = new Scanner(System.in);
        
        n1 = sc.nextDouble(); 
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        
        System.out.println("Triangulo2: ");
        
        double n4, n5, n6, p, p1, area1;
        
        n4 = sc.nextDouble(); 
        n5 = sc.nextDouble();
        n6 = sc.nextDouble();
        
        p = (n1 +  n2 + n3) / 2;
        
        
        area = Math.sqrt(p *(p - n1) * (p - n2) * (p - n3));
        
        System.out.printf("Area do triangulo 1: %.4f", area);
        System.out.println("");
        
        p1 = (n4 +  n5 + n6) / 2;
        
        
        area1 = Math.sqrt(p1 *(p1 - n4) * (p1 - n5) * (p1 - n6));
        
        System.out.printf("Area do triangulo 2: %.4f", area1);
        System.out.println("");
        
        if (area > area1){
            System.out.printf("O maior e: %.4f", area);
        } else {
            System.out.printf("O maior e: %.4f", area1);
        }
          
        sc.close(); 
    }
    
}
