import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        // Criação do Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de opções
        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Digite sua escolha: ");

        // Lê a escolha do usuário
        int escolha = scanner.nextInt();

        // Condicional para calcular área com base na escolha
        if (escolha == 1) {
            // Cálculo da área do quadrado
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = scanner.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("Área do quadrado: " + areaQuadrado);

        } else if (escolha == 2) {
            // Cálculo da área do círculo
            System.out.print("Digite o valor do raio do círculo: ");
            double raio = scanner.nextDouble();
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + areaCirculo);

        } else {
            System.out.println("Opção inválida.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
