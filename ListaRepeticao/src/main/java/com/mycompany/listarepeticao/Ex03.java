
package com.mycompany.listarepeticao;

import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        
        System.out.println("1. ALcool  2.Gaolinna  3.Diesel  4.Fim");
        
        int desc = 1, alc = 0, gas = 0, die = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        while (desc >= 1 || desc <=4 ){
            System.out.print("Digite o conbustivel: ");
            desc = teclado.nextInt();

            if (desc == 4){
                System.out.println("MUITO OBRIGADO");
                break;
            }else if (desc == 1) {
                alc += 1;
            }else if (desc == 2){
                gas += 1;
            }else if (desc == 3){
                die += 1;
            }
        }
        System.out.println("Alcool: " + alc +  
                            "\nGasolina: " + gas +
                                "\nDiesel: " +die);
        
        teclado.close();
    }
  
}
