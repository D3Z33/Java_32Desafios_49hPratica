package br.com.dezee.io;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorArquivo {

    public static void escreverArquivo() {
        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter escritor = new FileWriter("arquivo.txt")) {
            escritor.write(conteudo);
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}