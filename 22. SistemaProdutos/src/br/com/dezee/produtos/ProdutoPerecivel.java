package br.com.dezee.produtos;

import java.time.LocalDate;

// ProdutoPerecivel herda de Produto
public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    // Construtor que chama o super()
    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);  // Chama o construtor da classe mãe (Produto)
        this.dataValidade = dataValidade;
    }

    // Sobrescrevendo toString() para incluir a data de validade
    @Override
    public String toString() {
        return super.toString() + ", Validade: " + dataValidade;
    }
}