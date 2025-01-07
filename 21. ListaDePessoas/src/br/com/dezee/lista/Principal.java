package br.com.dezee.lista;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando o ArrayList de Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando pessoas à lista
        listaDePessoas.add(new Pessoa("Carlos Silva", 32));
        listaDePessoas.add(new Pessoa("Mariana Costa", 25));
        listaDePessoas.add(new Pessoa("João Almeida", 41));

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // Exibindo a primeira pessoa da lista
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        // Exibindo a lista completa
        System.out.println("\nLista completa:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
