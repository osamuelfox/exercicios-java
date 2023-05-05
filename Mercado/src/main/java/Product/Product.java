
package Product;

import com.mycompany.mercado.Mercado;
import java.util.Scanner;


public class Product {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        Mercado x;
        
        x = new Mercado();
        
        System.out.println("Nome do produto: ");
        x.Nome = teclado.next();
        
        System.out.println("Preco do produto: ");
        x.Preco = teclado.nextDouble();
        
        System.out.println("Quantidade dos produtos: ");
        x.Quantidade = teclado.nextInt();
        
        double valorTotal = x.Valor();
  
        System.out.println(x);
         
        System.out.println("Quantidade de a adicionar de produtos: ");
        int Quantidade = teclado.nextInt();
        x.addProdutos(Quantidade);
        
        System.out.println("Update " + x);
        
        System.out.println("Quantidade de removido: ");
        Quantidade = teclado.nextInt();
        x.removerProdutos(Quantidade);
        
        System.out.println("Removidos " + x);
        
    }         
 
}
