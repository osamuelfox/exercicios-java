package com.mycompany.listajava01;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        
        
        double v,r,a;
        String r1,a1;
        
        r1 = JOptionPane.showInputDialog("Digite o valor do raio da lata de oleo:");
        a1 = JOptionPane.showInputDialog("Digite o valor da altura da lata de oleo:");
        
        r = Double.parseDouble(r1);
        a = Double.parseDouble(a1);
        
        v = 3.14159*r*r*a;
        
        JOptionPane.showMessageDialog(null,"O valor do volume da lata de oléo é de: " + v + " \n"
                + "O valor do raio é de: " + r + " \n"
                        + "O valor da altura é de: " + a + " \n");
        
        JOptionPane.showMessageDialog(null, "Fim !!");        
        
}
}