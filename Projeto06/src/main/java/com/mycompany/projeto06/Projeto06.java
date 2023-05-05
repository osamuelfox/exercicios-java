/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto06;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author 890790
 */
public class Projeto06 {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Tela: "+lar +" X "+ alt);
    }
}
