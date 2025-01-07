package br.com.dezee.lista;

// Classe Pessoa com atributos e método toString()
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método toString para exibir os dados da pessoa
    @Override
    public String toString() {
        return "Pessoa { " +
                "Nome: '" + nome + '\'' +
                ", Idade: " + idade +
                " }";
    }
}