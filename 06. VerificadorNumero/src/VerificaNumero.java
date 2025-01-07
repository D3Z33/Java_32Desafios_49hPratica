import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é positivo ou negativo
        if (numero >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
