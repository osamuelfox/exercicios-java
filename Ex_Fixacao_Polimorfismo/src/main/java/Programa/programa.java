
package Programa;

import Product.Imported;
import Product.UserProduct;
import Product.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        List<Produto> list = new ArrayList<>();
        
        System.out.println("Enter the of product: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){    
            System.out.println("Product " + i +" data" );
            
            System.out.println("Common, user or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);    
            System.out.println("Nome: ");
            String name = sc.next();    
            System.out.println("Price: ");
            double price = sc.nextDouble();
            
            if(ch == 'i'){
                System.out.println("Customs fee: ");
                double fee = sc.nextDouble();
                Produto prod = new Imported(fee, name, price);
                list.add(prod);
            } else if (ch == 'u') {
                System.out.println("Manufacture date (dd/mm/yyyy)");
                Date date = sdf.parse(sc.next());
                Produto prod = new UserProduct(date, name, price);
                list.add(prod);                 
            } else {
                Produto prod = new Produto(name, price);
                list.add(prod);///
            }  
        }
        
        System.out.println("");
        System.out.println("PRICE TAGS");

        for (Produto item: list){
            System.out.println(item.priceTag());
        }
    }
}