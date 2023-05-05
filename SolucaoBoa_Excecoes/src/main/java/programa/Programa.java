
package programa;

import excecoes.DominioExcecao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import reserva.Reserva;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        try{
        
            System.out.println("Numero do quarto: ");
            int numero = sc.nextInt();

            System.out.println("Data de entrada: (dd/mm/yyyy)");
            Date entrada = sdf.parse(sc.next());

            System.out.println("Data de saida: (dd/mm/yyyy)");
            Date saida = sdf.parse(sc.next());


            Reserva reserva = new Reserva(numero, entrada, saida);
            System.out.println("Reserva: " + reserva);
            
            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva");
            System.out.println("Data de entrada: (dd/mm/yyyy)");
            entrada = sdf.parse(sc.next());
            System.out.println("Data de saida: (dd/mm/yyyy)");
            saida = sdf.parse(sc.next());

            reserva.atualizaData(entrada, saida);
            System.out.println("Reserva: " + reserva);
        
        }
        
        catch(ParseException e){
            System.out.println("Erro: formato de data inavalido");
            
        }
        catch(DominioExcecao e){
            System.out.println("Erro na reserva: " + e.getMessage());
        
        }
        catch(RuntimeException e){
            System.out.println("Erro inesperado");
        
        }

        sc.close();
        
    }
    
}
