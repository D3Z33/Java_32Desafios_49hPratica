package br.com.dezee.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        // Criando a lista de numeros inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando numeros à lista
        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(23);
        numeros.add(67);

        // Ordenando a lista em ordem crescente
        Collections.sort(numeros);

        // Imprimindo a lista ordenada
        System.out.println("Lista ordenada: " + numeros);
    }
}