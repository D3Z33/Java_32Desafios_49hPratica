package br.com.dezee.principal;

import java.util.Scanner;

public class DivisaoSimples {
    public static void realizarDivisao() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }
    }
}