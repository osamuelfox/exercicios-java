
package com.mycompany.exercicio_fixacao;

import entidade.Programa06;
import java.util.Scanner;


public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos valores vai ter cada vetor: ");
        int n = sc.nextInt();
        
        Programa06 programa06 = new Programa06(n);
        
        programa06.lerVetores();
        programa06.somaVetores();
        programa06.imprimirC();
        
        sc.close();
    }
    
    
}
