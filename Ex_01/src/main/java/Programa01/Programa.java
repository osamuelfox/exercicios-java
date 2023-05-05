
package Programa01;

import entidade.Department;
import entidade.Worker;
import entidade.HourContract;
import entidade.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nome departamento: ");
        String departmentNome = sc.nextLine();
        
        System.out.println("Nome: ");
        String workerName = sc.nextLine();
        
        System.out.println("Level: ");
        String workerLevel = sc.next();
        
        System.out.println("Salario base: ");
        double salarioBase = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),salarioBase, new Department(departmentNome));
        
        System.out.println("Numero de contratos: ");
        int Contratos = sc.nextInt();
        
        for (int i = 1; i <= Contratos; i++){
            System.out.println("Enter contract #" + (i) + " data: ");
            System.out.println("");
            
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            
            System.out.println("");
            System.out.println("Valor das Horas: ");
            double valuePerHour = sc.nextDouble();
            
            System.out.println("");
            System.out.println("Duração: (horas): ");
            int hours = sc.nextInt();
            
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
 
        }
        
        System.out.println("Digite o mês e o ano para calcular o rendimento: (mm/yyyy): ");
        
        String monthAndYear = sc.next();
        
        int month = Integer.parseInt(monthAndYear.substring(0,2)) ;
        int year = Integer.parseInt(monthAndYear.substring(3)) ;
        
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Income: " + monthAndYear + " :" + String.format("%.2f", worker.income(year, month)) );

        sc.close();

    }
    
}
