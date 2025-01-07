package br.com.dezee.tabuada;

// Implementação da interface Tabuada
public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    // Construtor que recebe o número da tabuada
    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    // Exibe a tabuada do número fornecido
    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Teste da classe
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(7);  // Exemplo com o número 7
        tabuada.mostrarTabuada();
    }
}