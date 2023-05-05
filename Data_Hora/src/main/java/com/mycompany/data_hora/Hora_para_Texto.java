
package com.mycompany.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Hora_para_Texto {
    
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26z");
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        System.out.println("d04 = " + d04.format(fmt1)); //Converter 2022-07-20 para 20/07/2022
        System.out.println("d04 = " + fmt1.format(d04));//Converter 2022-07-20 para 20/07/2022
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//Converter 2022-07-20 para 20/07/2022
        System.out.println("");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        
        
        System.out.println("d05 = " + d05.format(fmt1)); //Converter 2022-07-20T01:30:26 para 20/07/2022
        System.out.println("d05 = " + d05.format(fmt2)); //Converter 2022-07-20T01:30:26 para 20/07/2022 01:30
        System.out.println("d05 = " + d05.format(fmt4)); //Converter 2022-07-20T01:30:26 para 2022-07-20T01:30:26
        System.out.println("");
        
        System.out.println("d06 = " + fmt3.format(d06)); //Converter 2022-07-20T01:30:26z para 19/07/2022 22:30 fusorario
        System.out.println("d06 = " + fmt5.format(d06)); //Converter 2022-07-20T01:30:26z para 2022-07-20T01:30:26Z
        System.out.println("d06 = " + d06.toString());   //Converter 2022-07-20T01:30:26z para 2022-07-20T01:30:26Z
        System.out.println("");
        
        System.out.println("d05 = " + d05.format(fmt1));   //Converter 2022-07-20T01:30:26 para 20/07/2022
        System.out.println("d05 = " + d05.format(fmt2));   //Converter 2022-07-20T01:30:26 para 20/07/2022 01:30
        System.out.println("d05 = " + d05.format(fmt4));   //Converter 2022-07-20T01:30:26 para 2022-07-20T01:30:26
        System.out.println("");
        
        System.out.println("d06 = " + fmt3.format(d06));   //Converter 2022-07-20T01:30:26z para 19/07/2022 22:30
        System.out.println("d06 = " + fmt5.format(d06));   //Converter 2022-07-20T01:30:26z para 2022-07-20T01:30:26Z
        System.out.println("d06 = " + d06.toString());   //Converter 2022-07-20T01:30:26z para 2022-07-20T01:30:26Z
        System.out.println("");
        
        

    }

}
