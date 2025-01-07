import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Compara os dois números
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
