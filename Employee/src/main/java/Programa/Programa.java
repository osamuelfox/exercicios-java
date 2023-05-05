
package Programa;

import com.mycompany.employee.Employee;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        Employee x;
        
        x = new Employee();
        
        System.out.println("Nome: ");
        x.Nome = teclado.next();
        
        System.out.println("Salario Bruto: ");
        x.SalarioBruto = teclado.nextDouble();
        
        System.out.println("Taxa: ");
        x.Taxa = teclado.nextDouble();
        
        System.out.println("Employee: " + x.Nome + ", $ " + x.NovoSalario() );
        
        System.out.println("Which percentage to increase salary ? ");
        x.Porcentagem = teclado.nextDouble();
        
        System.out.println("Updated data: " + x.Nome + ", $ " + x.Ajuste());
        
        
        
    }
    
}
