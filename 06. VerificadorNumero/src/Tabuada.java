import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número para exibir a tabuada
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de 1 a 10 usando um loop for
        System.out.println("\nTabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o scanner
        scanner.close();
    }
}
