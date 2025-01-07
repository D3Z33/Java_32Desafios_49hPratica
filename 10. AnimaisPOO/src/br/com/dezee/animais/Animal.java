package br.com.dezee.animais;

// Superclasse Animal
public class Animal {
    // Atributos
    String nome;
    int idade;

    // Metodo (ação) genérico para todos os animais
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}
