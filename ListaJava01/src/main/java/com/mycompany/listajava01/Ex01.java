package com.mycompany.listajava01;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        int cont = 0;
        float maisAlto = 0,maisBaixo = 0,soma = 0,media = 0, altura;
        int mulher = 0, homem = 0;
        String altura1, sexo;
        
        //Laço Repetição
        while (cont < 3){
            cont = cont + 1;
            
            //Solicitando Altura e Realizando Conversão
            altura1 = JOptionPane.showInputDialog("Digite a Altura");
            altura = Float.parseFloat(altura1);
            
            //Sexo
            sexo = JOptionPane.showInputDialog("Digite 'm' ou 'f' ");
            
            if (!sexo.equals("m") && !sexo.equals("f")){
                JOptionPane.showMessageDialog(null,"Escolha um sexo valido");
                sexo = JOptionPane.showInputDialog("Digite 'm' ou 'f' "); 
            }
            if (altura > maisAlto){
                maisAlto = altura;
                maisBaixo = altura;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
            }
            //Contador Verificação Quantas Mulheres
            if (sexo.equals("f")){
                mulher++;
            }
            //Contador Verificação Média Altura Homem
            if (sexo.equals("m")){
                soma = soma + altura;
                homem++;
            }
            media = soma / homem ;
        }
     
        JOptionPane.showMessageDialog(null,"O mais alto: " + maisAlto + "\n"
            + "O mais baixo: " + maisBaixo + "\n"
                + "Numero de mulheres: " + mulher + "\n"
                    + "Media altura homem: " + media);
    }
}
