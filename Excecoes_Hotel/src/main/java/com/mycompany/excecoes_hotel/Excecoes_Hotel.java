
package com.mycompany.excecoes_hotel;

import Exception.exception;
import entidade.reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Excecoes_Hotel {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        reserva quarto = new reserva();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Numero do quarto: ");
        Integer numero = sc.nextInt();
       
        try{
        System.out.println("Checkin date (dd/mm/yyyy): ");
        Date inicioData = sdf.parse(sc.next())  ;
        
        System.out.println("Checkout date (dd/mm/yyyy): ");
        Date fimData = sdf.parse(sc.next());

        quarto = new reserva(numero ,inicioData, fimData);
        
        
        }
        catch(ex){
            System.out.println(e.getMessage());           

        }
       
        
        System.out.println(quarto);
        
        System.out.println("Update dates ");
        
        System.out.println("Digite a data Inicial: ");
        Date dateIni = sdf.parse(sc.next());
        
        System.out.println("Digite a data Final: ");
        Date datefim = sdf.parse(sc.next());
        
        quarto.updateDates(dateIni, datefim);
        
        System.out.println(quarto);
        
    }

}

