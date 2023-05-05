
package com.mycompany.laco_for_each;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Ex_Fixacao {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de funcionarios: ");
        int n = sc.nextInt();
        
        List <String> listNome = new ArrayList<>();
        List <Integer> listId = new ArrayList<>();
        List <Double> listSalario = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            System.out.println("Emplyoee #" + (i+1));

            System.out.println("Id: ");
            Integer Id = sc.nextInt();
            listId.add(Id);
            
            System.out.println("Nome: ");
            sc.nextLine();
            String Nome = sc.nextLine();
            listNome.add(Nome);
            
            System.out.println("Salario: ");
            double Salario = sc.nextDouble();
            listSalario.add(Salario);

        }
        
        System.out.println("Digite o Id que deseja incrementar: ");
        int Idverifc = sc.nextInt();
        
        Integer ID = listId.stream().filter(x -> x.intValue() == Idverifc).findFirst().orElse(null);
        System.out.println(ID);
        
        if (ID != null){
            System.out.println("Enter the percentage: ");
            double Porcentagem = sc.nextDouble();
            
        } else {
            System.out.println("This id does not exist!");
        }
        
            
        
        

    }        
}
    
