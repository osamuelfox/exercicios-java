
package com.mycompany.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Data_Hora_Para_Local {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26z");
        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println("r1 = " + r1);// Conversao 2022-07-20T01:30:26z para 2022-07-19 com fuso horario
        System.out.println("r2 = " + r2);// Conversao 2022-07-20T01:30:26z para 2022-07-19T22:30:26 com fuso horario de Portugal 
        System.out.println("r3 = " + r3);// Conversao 2022-07-20T01:30:26z para 2022-07-19 com fuso horario
        System.out.println("r4 = " + r4);// Conversao 2022-07-20T01:30:26z para 2022-07-20T02:30:26 com fuso horario
        System.out.println("");
        
        System.out.println("d04 dia = " + d04.getDayOfMonth()); //Ira mostrar o dia 
        System.out.println("d04 mes = " + r1.getMonthValue()); //Ira mostrar o mes 
        System.out.println("d04 ano = " + r1.getYear()); // Ira mostrar o ano
        System.out.println("");
        
        System.out.println("d05 hora = " + d05.getHour());//Ira mostrar a hora
        System.out.println("d05 hora = " + d05.getMinute());//Ira mostrar os minutos
       
        
        
        
        
        
    }
    
}
