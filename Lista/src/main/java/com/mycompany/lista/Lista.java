/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 890790
 */
public class Lista {

    public static void main(String[] args) {
        
        //Numeros aleatorios com Scanner
                
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();        

        Random gerador = new Random();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(gerador.nextInt(5));
        }
    }
}
