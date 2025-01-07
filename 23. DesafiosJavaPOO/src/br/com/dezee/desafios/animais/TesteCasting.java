package br.com.dezee.desafios.animais;

public class TesteCasting {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        // Verifica se o objeto é uma instância de Animal antes do casting
        if (cachorro instanceof Animal) {
            Animal animal = (Animal) cachorro;
            animal.emitirSom();
        } else {
            System.out.println("O objeto não é um Animal.");
        }
    }
}