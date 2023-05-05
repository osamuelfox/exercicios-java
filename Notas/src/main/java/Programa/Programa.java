
package Programa;

import com.mycompany.notas.Notas;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       
       Notas x = new Notas();
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Nome: ");
        x.nome = teclado.next();
        
        System.out.println("Notas: ");
        x.Nota1 = teclado.nextDouble();
        x.Nota2 = teclado.nextDouble();
        x.Nota3 = teclado.nextDouble();
        
        
        
        if (x.Total() > 60){
            System.out.printf("FINAL GRADE: %.2f", x.Total());
            System.out.println("");
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE: %.2f", x.Total());
            System.out.println("");
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f", x.Restante());
            System.out.printf(" POINTS");
        }
        
       
       

    }
    
    
    
   
    
    
    
    
}
