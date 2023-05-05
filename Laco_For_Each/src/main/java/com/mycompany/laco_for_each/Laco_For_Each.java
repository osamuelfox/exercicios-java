/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laco_for_each;

/**
 *
 * @author 890790
 */
public class Laco_For_Each {

    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        
        /*for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }*/
        
        for (String obj : vect) {
            System.out.println(obj);
        }
        
        
        
    }
}