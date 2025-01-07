package br.com.dezee.principal;

import br.com.dezee.exception.ErroConsultaGitHubException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaGitHub {
    public static void consultarUsuarioGitHub(String usuario) {
        String url = "https://api.github.com/users/" + usuario;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário " + usuario + " não encontrado.");
            }

            System.out.println("\nResposta da API:");
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao consultar a API: " + e.getMessage());
        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro específico: " + e.getMessage());
        }
    }
}