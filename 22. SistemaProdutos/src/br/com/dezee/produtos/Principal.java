package br.com.dezee.produtos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando o ArrayList de Produto
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        // Adicionando produtos usando o construtor
        listaDeProdutos.add(new Produto("Notebook", 4500.0, 5));
        listaDeProdutos.add(new Produto("Smartphone", 2500.0, 10));
        listaDeProdutos.add(new Produto("Fone de Ouvido", 300.0, 25));

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());

        // Exibindo o produto na posição 1 (segundo elemento)
        System.out.println("\nProduto na posição 1: " + listaDeProdutos.get(1));

        // Exibindo a lista completa de produtos
        System.out.println("\nLista completa de produtos:");
        for (Produto p : listaDeProdutos) {
            System.out.println(p);  // toString() é chamado automaticamente
        }
    }
}