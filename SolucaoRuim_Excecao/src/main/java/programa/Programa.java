
package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import reserva.Reserva;

public class Programa {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        System.out.println("Numero do quarto: ");
        int numero = sc.nextInt();
        
        System.out.println("Data de entrada: (dd/mm/yyyy)");
        Date entrada = sdf.parse(sc.next());
        
        System.out.println("Data de saida: (dd/mm/yyyy)");
        Date saida = sdf.parse(sc.next());
        
        if (!saida.after(entrada)){
            System.out.println("Erro na reserva: data de saida anterior a data de entrada");
        }
        else {
            Reserva reserva = new Reserva(numero, entrada, saida);
            System.out.println("Reserva: " + reserva);
            
            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva");
            System.out.println("Data de entrada: (dd/mm/yyyy)");
            entrada = sdf.parse(sc.next());
            System.out.println("Data de saida: (dd/mm/yyyy)");
            saida = sdf.parse(sc.next());
            
            String erro = reserva.atualizaData(entrada, saida);
            
            if(erro != null ){
                System.out.println("Erro na reserva");
            }
            else {
                System.out.println("Reserva: " + reserva);
            }   
        }
        sc.close();
    }    
}
