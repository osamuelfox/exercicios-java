
package Product;

import com.mycompany.mercado.Mercado;
import java.util.Locale;
import java.util.Scanner;


public class Product {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do produto: ");
        String Nome = sc.nextLine();
        
        System.out.println("Preco do produto: ");
        double Preco = sc.nextDouble();
        
        Mercado mercado = new Mercado(Nome, Preco);
        
        
        mercado.setNome("Computer");
        System.out.println("Novo Nome: " + mercado.getNome());
        
        mercado.setPreco(1200.00);
        System.out.println("Novo Preco: " + mercado.getPreco());
        
        System.out.println("");
        System.out.println("Produto: " + mercado);
        System.out.println("");
        System.out.println("Numero de produtos a adicionar no estoque: ");
        int Quantidade = sc.nextInt();
        mercado.addProdutos(Quantidade);
        
        System.out.println("");
        System.out.println("Nova atualizacao: " + mercado );
        System.out.println("");
        
        System.out.println("Numero de produtos a ser removido do estoque: ");
        Quantidade = sc.nextInt();
        mercado.removerProdutos(Quantidade);
        System.out.println("");
        System.out.println("Nova atualizacao: " + mercado);
        sc.close();
       
    }         
 
}
