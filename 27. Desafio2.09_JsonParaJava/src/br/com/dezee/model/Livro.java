package br.com.dezee.model;

public record Livro(String titulo, String autor, Editora editora) {
    public record Editora(String nome, String cidade) {
    }
}