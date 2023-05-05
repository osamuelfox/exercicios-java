
package com.mycompany.teste_java;

import entidade.Compromisso;
import java.text.ParseException;
import java.util.Scanner;

public class Atividade04 {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner scanner = new Scanner(System.in);
        
        GerenciadorCompromissos compromisso = new GerenciadorCompromissos();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar um compromisso");
            System.out.println("2 - Remover um compromisso");
            System.out.println("3 - Ver lista de compromissos");
            System.out.println("4 - Compromisso por data");
            System.out.println("5 - Compromisso por data");
            
            
            System.out.println("6 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do compromisso:");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Digite a data do compromisso:");
                    String data = scanner.nextLine();
                    
                    System.out.println("Digite a hora do compromisso:");
                    String Hora = scanner.nextLine();
                    
                    System.out.println("Digite o local:");
                    String local = scanner.nextLine();
                    
                    System.out.println("Digite a descricao:");
                    String descricao = scanner.nextLine();
                    
        
                    compromisso.adicionarCompromisso(new Compromisso(nome,data,Hora,local,descricao));
                    
                    System.out.println("Cadastrado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o Nome do Compromisso:");
                    String Nome = scanner.next();
                    compromisso.removerCompromisso(Nome);
          
                    break;  
                case 3:
                    compromisso.listarCompromissos();
    
                    break;
                case 4:
                    System.out.println("Digite a data do compromisso");
                    String Data = scanner.next();
                    compromisso.listarCompromissosData(Data);
                    break;
                case 5:
                    
                    System.out.println("Digite a data inicial (dd/MM/yyyy):");
                    String dataInicial = scanner.nextLine();
                    System.out.println("Digite a data final (dd/MM/yyyy):");
                    String dataFinal = scanner.nextLine();
                    compromisso.listarCompromissosNoIntervalo(dataInicial, dataFinal);
                    break;
                    
                    
                case 6:
                     System.out.println("Fim");
                    
                    break;
                    

            }
        }
    } 
}
