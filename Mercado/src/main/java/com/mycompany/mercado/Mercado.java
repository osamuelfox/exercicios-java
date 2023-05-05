
package com.mycompany.mercado;

public class Mercado {
        
        public String Nome;
        public double Preco;     public int Quantidade;
        
        public double Valor() {
            
            double v =  (Preco * Quantidade);
            return v;
         
        }
        
        public int addProdutos(int Quantidade){
            return this.Quantidade += Quantidade;
        }
          
        public String toString() {
            return Nome
                    + ", $"
                    + String.format("%.2f", Preco)
                    + ", "
                    + Quantidade
                    + " unidade, Total: $ "
                    +String.format("%.2f", Valor());
        }
        
        public int removerProdutos(int Quantidade){
            return this.Quantidade -= Quantidade;
        }

}
