package br.com.dezee.desafios.lista;

import java.util.ArrayList;

public class ListaStrings {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> linguagens = new ArrayList<>();

        // Adicionando elementos à lista
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("C++");

        // Percorrendo e imprimindo com foreach
        for (String linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}