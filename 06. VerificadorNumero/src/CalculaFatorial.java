import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicializa o fatorial como 1 (valor neutro da multiplicação)
        long fatorial = 1;

        // Calcula o fatorial usando um loop for
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        // Exibe o resultado do fatorial
        System.out.println("Fatorial de " + numero + " é: " + fatorial);

        // Fecha o scanner
        scanner.close();
    }
}
