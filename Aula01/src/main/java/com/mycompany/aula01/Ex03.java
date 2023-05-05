
package com.mycompany.aula01;


public class Ex03 {
    public static void main(String[] args) {
        String original = "acbde FGHIJ ABC abc DEFG ";
        
        String s01 = original.toLowerCase();
        
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-"); //Ira colocar todo texto em minusculo
        
        String s02 = original.toUpperCase();
        
        System.out.println("toUpperCase: -" + s02 + "-"); //Ira colocar todo texto em maiusculo
        
        String s03 = original.trim();
        
        System.out.println("trim: -" + s03 + "-"); //Ira tirar o espaco antes de depois do texto
        
        String s04 = original.substring(2);
        
        System.out.println("subtring(2): -" + s04 + "-"); //Ira tirar os dois primeiros caracteres
        
        String s05 = original.substring(2, 9);
        
        System.out.println("subtring(2, 9): -" + s05 + "-"); //Ira tirar os dois primeiros caracteres e nove de tras para frente
        
        String s06 = original.replace('a', 'x');
        
        System.out.println("replace('a', 'x'): -" + s06 + "-"); //Ira substituir o 'a' pelo 'x'
        
        String s07 = original.replace("abc", "xy");
        
        System.out.println("replace('abc', 'xy'): -" + s07 + "-"); //Ira substituir o 'abc' pelo 'xy'
        
        int i = original.indexOf("bc");
        
        int j = original.lastIndexOf("bc");
        
        System.out.println("Index of 'bc: '" + i);
        
        System.out.println("Last index of 'bc: '" + j);
      
    }
    
}
