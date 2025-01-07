package br.com.dezee.principal;

import br.com.dezee.exception.SenhaInvalidaException;
import java.util.Scanner;

public class VerificadorSenha {
    public static void verificarSenha() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("Senha deve ter pelo menos 8 caracteres.");
            }
            System.out.println("Senha válida!");

        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}