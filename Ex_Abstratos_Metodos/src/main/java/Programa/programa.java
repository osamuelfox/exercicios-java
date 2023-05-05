
package Programa;

import entidade.Circulo;
import entidade.Forma;
import entidade.Retangulo;
import entidade.enums.Cor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        List<Forma> list = new ArrayList<>();
        
        System.out.println("Entre com o numero de figuras: ");
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++ ){
            System.out.println("Dados da forma #" + (i+1) + ": ");
            System.out.println("Retangulo ou Circulo (r/c)?");
            
            char ch = sc.next().charAt(0);
            
            System.out.println("Qual a cor ? (Preto/Azul/Vermelho)");
            
            Cor cor = Cor.valueOf(sc.next());
            
            if(ch == 'r'){
                System.out.println("Largura: ");
                double largura = sc.nextDouble();
                
                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                
                list.add(new Retangulo(altura, largura, cor));
            }
            
            else {
                System.out.println("Raio: ");
                double raio = sc.nextDouble();
                
                list.add(new Circulo(raio, cor));
            }
        }
        
        System.out.println();
        System.out.println("Areas das Figuras: ");
        for(Forma forma : list){
            System.out.println(String.format("%.2f", forma.area()));
        }
        
        sc.close();
    }
}
