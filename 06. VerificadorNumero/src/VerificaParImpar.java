import java.util.Scanner;

public class VerificaParImpar {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
