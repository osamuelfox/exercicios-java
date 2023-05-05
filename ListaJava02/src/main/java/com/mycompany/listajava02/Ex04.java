
package com.mycompany.listajava02;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int num;
        double hora,valor,salario;
        
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero do funcionario: ");
        num = teclado.nextInt();
        
        System.out.print("Digite o numero de horas: ");
        hora = teclado.nextDouble();

        System.out.print("Digite o valor das horas: ");

        valor = teclado.nextDouble();
        
        salario = valor * hora;
       
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f  ",num , salario);
         
    }

}
