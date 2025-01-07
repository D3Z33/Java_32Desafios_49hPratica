package br.com.dezee.produtos;

// Classe Produto com atributos e construtor
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Metodo toString() para exibir o produto em texto
    @Override
    public String toString() {
        return "Produto { Nome: " + nome +
                ", Preço: R$ " + preco +
                ", Quantidade: " + quantidade + " }";
    }
}
