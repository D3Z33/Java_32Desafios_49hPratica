package br.com.dezee.api.books;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GoogleBooksAPI {

    private static final String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro para busca: ");
        String tituloLivro = scanner.nextLine();

        // Codifica o título para evitar erro de espaço na URL
        String endereco = BASE_URL + URLEncoder.encode(tituloLivro, StandardCharsets.UTF_8);

        // Criação do cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Criação da requisição HTTP
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        // Envio da requisição e resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Exibe o resultado
        System.out.println("\nResultado da busca:");
        System.out.println(response.body());
    }
}