package br.com.dezee.animais;

// A subclasse Gato herda de Animal (extends Animal)
public class Gato extends Cachorro.Animal {

    // Sobrescrevendo o metodo emitirSom (Comportamento próprio)
    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando: Miau!");
    }

    // Metodo próprio da subclasse Gato
    public void arranharMoveis() {
        System.out.println(nome + " está arranhando os móveis.");
    }
}
