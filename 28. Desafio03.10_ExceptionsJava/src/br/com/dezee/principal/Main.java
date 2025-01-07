package br.com.dezee.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Divisão
        DivisaoSimples.realizarDivisao();

        // Verificação de Senha
        VerificadorSenha.verificarSenha();

        // Consulta GitHub
        System.out.print("\nDigite o nome de um usuário do GitHub: ");
        String usuario = scanner.nextLine();
        ConsultaGitHub.consultarUsuarioGitHub(usuario);
    }
}