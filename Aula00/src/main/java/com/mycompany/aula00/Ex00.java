/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula00;

import java.util.Locale;

/**
 *
 * @author 890790
 */
public class Ex00 {
        public static void main(String[] args) {
            String product1 = "Computer";
            String product2 = "Office desk";
            
            int age = 30;
            int code = 5290;
            char gender = 'F';
            
            double price1 = 2100.0;
            double price2 = 650.50;
            double measure = 53.234567;
            
            System.out.printf("Product: %n%s ,which price is $ %.2f %n", product1, price1);
            System.out.printf("%s ,which price is $ %.2f %n",product2, price2);
            System.out.println("");
            System.out.printf("Record: %d years old, code %d and gender: %s ",age, code, gender);
            System.out.println("");
            System.out.printf("Measue with eight dercimal places: %f %n",measure);
            System.out.printf("Rouded (tree decimal places): %.3f %n", measure);
            Locale.setDefault(Locale.US);
            System.out.printf("Us decimal point: %.3f %n", measure);
        }
    
}
