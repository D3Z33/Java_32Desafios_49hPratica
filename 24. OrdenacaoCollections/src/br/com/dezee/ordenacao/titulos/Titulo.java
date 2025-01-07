package br.com.dezee.ordenacao.titulos;

// Classe Titulo implementando Comparable
public class Titulo implements Comparable<Titulo> {
    private String nome;

    // Construtor
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Metodo para obter o nome
    public String getNome() {
        return nome;
    }

    // Metodo compareTo para ordenacao por nome
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + nome;
    }
}