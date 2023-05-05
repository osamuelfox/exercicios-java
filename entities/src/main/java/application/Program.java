
package application;

import com.mycompany.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        
        Triangle x, y;
        
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of triangle x: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();
        
        System.out.println("Enter the measure of triangle y: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        if (areaX > areaY){
            System.out.printf("O maior e: %.4f", areaX);
        } else {
            System.out.printf("O maior e: %.4f", areaY);
        }
    }
}
