package br.com.dezee.api.crypto;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CoinGeckoAPI {

    private static final String BASE_URL = "https://api.coingecko.com/api/v3/simple/price?ids=";

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da criptomoeda (ex: bitcoin, ethereum): ");
        String moeda = scanner.nextLine();

        // Codifica o nome da moeda para a URL
        String endereco = BASE_URL + URLEncoder.encode(moeda, StandardCharsets.UTF_8) + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("\nCotação da moeda:");
        System.out.println(response.body());
    }
}