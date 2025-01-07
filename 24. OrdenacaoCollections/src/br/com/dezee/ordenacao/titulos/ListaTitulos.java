package br.com.dezee.ordenacao.titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTitulos {
    public static void main(String[] args) {
        // Criando lista de Titulos
        List<Titulo> titulos = new ArrayList<>();

        // Adicionando Titulos à lista
        titulos.add(new Titulo("Java Fundamentos"));
        titulos.add(new Titulo("Estrutura de Dados"));
        titulos.add(new Titulo("Banco de Dados"));
        titulos.add(new Titulo("Redes de Computadores"));

        // Ordenando a lista com Collections.sort
        Collections.sort(titulos);

        // Imprimindo Titulos ordenados
        System.out.println("\nTitulos Ordenados:");
        for (Titulo t : titulos) {
            System.out.println(t);
        }
    }
}