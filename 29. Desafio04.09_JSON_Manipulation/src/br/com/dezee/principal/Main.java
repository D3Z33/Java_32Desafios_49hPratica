package br.com.dezee.principal;

import br.com.dezee.io.EscritorArquivo;
import br.com.dezee.model.Titulo;
import br.com.dezee.model.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        // Escrever no arquivo
        EscritorArquivo.escreverArquivo();

        // Serializar Titulo para JSON
        Titulo titulo = new Titulo("Matrix", 1999, "Ficção Científica");
        Gson gsonTitulo = new GsonBuilder().setPrettyPrinting().create();
        String jsonTitulo = gsonTitulo.toJson(titulo);
        System.out.println("\nJSON do Título:");
        System.out.println(jsonTitulo);

        // Serializar Veículo para JSON
        Veiculo veiculo = new Veiculo("Civic", 2023, "Honda");
        Gson gsonVeiculo = new GsonBuilder().setPrettyPrinting().create();
        String jsonVeiculo = gsonVeiculo.toJson(veiculo);
        System.out.println("\nJSON do Veículo:");
        System.out.println(jsonVeiculo);
    }
}