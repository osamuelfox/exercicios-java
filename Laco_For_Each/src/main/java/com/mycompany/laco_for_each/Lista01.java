
package com.mycompany.laco_for_each;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lista01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        //Lista de nomes
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Marco");
        
        //Quantidade de elementos na lista
        System.out.println(list.size());
        
        //Ira mostrar os elementos da lista
        for (String x: list){
            System.out.println(x);
        }
        
        System.out.println("----------------------");
        
        //Ira remover da lista os elementos que começa com "M"
        list.removeIf(x -> x.charAt(0) == 'M');
        
        //Ira mostrar os elementos da lista
        for (String x : list){
            System.out.println(x);
        }
        
        System.out.println("--------------------");
        
        //Ira mostrar se existe "Bob" dentro da lista e retornar (1) caso tenha e (-1)caso nao tenha
        System.out.println("index of Bob: " + list.indexOf("Bob"));
        System.out.println("index of Marco: " + list.indexOf("Marco"));
        
        System.out.println("----------------------");
        
        //Ira criar uma variavel "result" para armazenar os nomes que comece com "A".
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
       
        
        //Ira mostrar os elementos em result
        for (String x : result){
            System.out.println(x);
        }
        
        System.out.println("------------------");
        
        //Ira armazenar o primeiro nome que começar com "J", caso nao tenha ira retornar "null"
        String name = list.stream().filter(x -> x.charAt(1) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
    
}
