package br.com.dezee.animais;

// A subclasse Cachorro herda de Animal (extends Animal)
public class Cachorro extends Animal {

    // Sobrescrevendo o metodo emitirSom (Comportamento próprio)
    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    // Metodo próprio da subclasse Cachorro
    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }

    // Superclasse Animal
    public static class Animal {
        // Atributos
        String nome;
        int idade;

        // Metodo (ação) genérico para todos os animais
        public void emitirSom() {
            System.out.println("O animal está emitindo um som.");
        }
    }
}
