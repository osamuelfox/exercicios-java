/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto03;

/**
 *
 * @author 890790
 */
public class Projeto03 {

     public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;
        
        int gastosTrimestrais = janeiro + fevereiro + marco;
        
        System.out.println(gastosTrimestrais);
        
        if (gastosTrimestrais >= 50000){
            System.out.println("Estorou o orcamento!");
            
        }else {
            System.out.println("Esta dentro do orcamento");
        }
        
       
    }
}
