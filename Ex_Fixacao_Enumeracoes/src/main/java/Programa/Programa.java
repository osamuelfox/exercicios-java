
package Programa;


import entidade.Client;
import entidade.Order;
import entidade.OrderItem;
import entidade.Product;
import entidade.enums.OrderStatus;
import java.awt.ItemSelectable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;


public class Programa {
   
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        OrderItem orderItem = new OrderItem();

        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        
        String name = "Alex Green"; 
        String email = "alex@gmail.com";
        Date date = sdf.parse("15/03/1985");
        
        Client client = new Client(name, email, date); 
        
        System.out.println("Enter order data");
        
        Date moment = Date.from(Instant.now());
        
        String Status = ( "PROCESSING");
        
        Order order = new Order(moment, OrderStatus.valueOf(Status),client);
        
        int num = 2;
        
        for (int i = 0; i < num; i++ ){
            System.out.println("Nome: ");
            String Name = sc.next();
            
            System.out.println("Preco");
            Double Price = sc.nextDouble();
            
            System.out.println("Quantidade");
            int Quantify = sc.nextInt();
            
            product = new Product(Name, Price);
            orderItem = new OrderItem(Quantify, Price);
           
            order.addItem(orderItem);
        }
        
        System.out.println("Order moment: " + order.getMoment() );
        System.out.println("Order status: " + order.getStatus());
        
        System.out.println(client);
        
        int i = 0;        
        for (OrderItem item : order.getItens()){
            System.out.println(item);
            i++;
       }
        System.out.println("Total: " + order.Total(orderItem));

    }
       
}
