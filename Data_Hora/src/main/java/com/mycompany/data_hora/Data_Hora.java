
package com.mycompany.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Data_Hora {

    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        System.out.println("do1 = " + d01.toString()); //Ira mostrar a data atual
        
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02.toString()); //Ira mostrar a data e a hora atual
        
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03.toString()); //Ira mostrar a data e a hora no fusorario de londres
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println("d04 = " + d04.toString()); // Ira mostrar a data predefinida
        
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");        
        System.out.println("d05 = " + d05.toString());// Ira mostrar a data e hora predefinida
        
        Instant d06 = Instant.parse("2022-07-20T01:30:26z");       
        System.out.println("d06 = " + d06.toString());// Ira mostrar a data predefinida
        
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");        
        System.out.println("d07 = " + d07.toString());//Ira mostrar a data e hora predefinida + 3 horas

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Ira converter para 20-07-2022    
        System.out.println("d08 = " + d08.toString());
        
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Ira converter para 20-07-2022T01:30   
        System.out.println("d09 = " + d09.toString());
       
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        System.out.println("d10 = " + d10.toString()); // Ira converter para 20-07-2022

        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
        System.out.println("d11 = " + d11.toString()); // Ira converter para 20-07-2022T01:30
        
        
    }
}
