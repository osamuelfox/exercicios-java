
package com.mycompany.aula01;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        System.out.println("3 numeros de entrada");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println("higher = " + a);
        } else if (b > c) {
            System.out.println("higher = " + b);
        } else {
            System.out.println("higher = " + c);
        }
        
        sc.close();
 
    }
    
}
