package br.com.dezee.ordenacao.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteList {
    public static void main(String[] args) {
        // Criando uma lista utilizando ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");

        System.out.println("ArrayList:");
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }

        // Criando uma lista utilizando LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Item A");
        linkedList.add("Item B");
        linkedList.add("Item C");

        System.out.println("\nLinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}