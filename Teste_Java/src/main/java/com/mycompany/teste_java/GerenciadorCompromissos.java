
package com.mycompany.teste_java;

import entidade.Compromisso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GerenciadorCompromissos {

    private Compromisso[] compromissos;
    private int qtdCompromissos;

    public GerenciadorCompromissos() {
        compromissos = new Compromisso[100];
        qtdCompromissos = 0;
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        if (qtdCompromissos == compromissos.length) {
            System.out.println("Compromisso nao cadastrado");
            return;
        }
        compromissos[qtdCompromissos] = compromisso;
        qtdCompromissos++;
    }

    public void removerCompromisso(String nome) {
        for (int i = 0; i < qtdCompromissos; i++) {
            Compromisso compromisso = compromissos[i];
            if (compromisso.getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < qtdCompromissos - 1; j++) {
                    compromissos[j] = compromissos[j + 1];
                }
                compromissos[qtdCompromissos - 1] = null;
                qtdCompromissos--;
                System.out.println("Compromisso removido com sucesso.");
                break;
            } else{System.out.println("Compromisso nao encontrado");}
        }
        
    }

    public void listarCompromissos() {
        if (qtdCompromissos == 0) {
            System.out.println("Não há compromissos agendados.");
        } else {
            System.out.println("Lista de compromissos:");
            for (int i = 0; i < qtdCompromissos; i++) {
                System.out.println(compromissos[i]);
            }
        }
    }
    
    
    public void listarCompromissosData(String data) {
        int count = 0;
        for (int i = 0; i < qtdCompromissos; i++) {
            Compromisso compromisso = compromissos[i];
            if (compromisso.getData().equalsIgnoreCase(data)) {
                System.out.println(compromisso);
                count++;
                return;
            }
        }
        if (count == 0) {
            System.out.println("Não há compromissos agendados para essa data.");
        }
    }
    
    
    public void listarCompromissosNoIntervalo(String dataInicial, String dataFinal) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date dataIni, dataFim;
    try {
        dataIni = sdf.parse(dataInicial);
        dataFim = sdf.parse(dataFinal);
    } catch (ParseException e) {
        System.out.println("Erro ao converter data.");
        return;
    }
    System.out.println("Lista de compromissos no intervalo de " + dataInicial + " a " + dataFinal + ":");
    boolean temCompromisso = false;
    for (int i = 0; i < qtdCompromissos; i++) {
        Compromisso compromisso = compromissos[i];
        Date dataCompromisso = sdf.parse(compromisso.getHora());
        if (dataCompromisso.compareTo(dataIni) >= 0 && dataCompromisso.compareTo(dataFim) <= 0) {
            System.out.println(compromisso);
            temCompromisso = true;
        }
    }
    if (!temCompromisso) {
        System.out.println("Não há compromissos no intervalo especificado.");
    }
}
    
}
