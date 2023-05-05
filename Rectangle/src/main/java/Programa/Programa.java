
package Programa;

import com.mycompany.rectangle.Rectangle;
import java.util.Scanner;


public class Programa {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Rectangle x;
        
        x = new Rectangle();
        
        System.out.println("Altura: ");
        x.Altura = teclado.nextDouble();
        
        System.out.println("Largura: ");
        x.Largura = teclado.nextDouble();
        
        double area = x.Area();
        System.out.println("AREA: " + area);
        
        double perimetro = x.Perimetro();
        System.out.println("PERIMETRO: " +  perimetro);
        
        double diagonal = x.Diagonal();
        System.out.println("DIAGONAL: " + diagonal);
        
    }
    
}
