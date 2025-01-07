package br.com.dezee.desafios.produtos;

import java.util.ArrayList;

public class ListaProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 4500.0));
        produtos.add(new Produto("Mouse", 150.0));
        produtos.add(new Produto("Monitor", 1200.0));

        double soma = 0;

        // Calculando o preço médio
        for (Produto p : produtos) {
            soma += p.getPreco();
        }

        double media = soma / produtos.size();

        System.out.println("Preço médio: R$ " + media);
    }
}