package br.com.dezee.api.recipes;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TheMealDBAPI {

    private static final String BASE_URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da receita: ");
        String receita = scanner.nextLine();

        // Codifica o nome da receita
        String endereco = BASE_URL + URLEncoder.encode(receita, StandardCharsets.UTF_8);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("\nResultado da busca:");
        System.out.println(response.body());
    }
}