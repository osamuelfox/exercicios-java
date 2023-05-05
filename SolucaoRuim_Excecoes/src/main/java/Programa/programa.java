
package Programa;

import entidade.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        System.out.println("Numero do quarto: ");
        int numero = sc.nextInt();
        
        System.out.println("Data de entrada: (dd/mm/yyyy)");
        Date checkin = sdf.parse(sc.next());
        
        System.out.println("Data de saida: (dd/mm/yyyy)");
        Date checkout = sdf.parse(sc.next());
        
        if(!checkout.after(checkin)){
            System.out.println("Erro na reserva: data de checkout anterior a data de checkin");
            
        }
        else {
            Reserva reserva = new Reserva(numero, checkin, checkout);
            System.out.println("Reserva: " + reserva);
            
            System.out.println("");
            System.out.println("Entre comn a data para atualizar a reserva");
            System.out.println("Data de Checkin: (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            
            System.out.println("Data de Chechout: (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());
            
           Date presente = new Date();
            if(checkin.before(presente) || checkout.before(presente)){
               System.out.println("Erro na reserva: reserva somente podem ser feitas com datas futuras");
     
            }
            
            else if (!checkout.after(checkin)){
                System.out.println("Erro na reserva: data de checkout anterior a data de entrada");
                 
            }
            else {
                reserva.updateDates(checkin, checkout);
                System.out.println("Reserva: " + reserva );
            }
        }
        sc.close();
    }
    
}
