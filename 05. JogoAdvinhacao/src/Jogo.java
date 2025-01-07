import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        // Gerando um número aleatório entre 0 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Gera de 0 a 100

        // Scanner para obter o palpite do usuário
        Scanner scanner = new Scanner(System.in);

        // Inicializando variáveis
        int tentativa = 0;
        int maxTentativas = 5;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem 5 tentativas.");

        // Loop para controlar as tentativas
        while (tentativa < maxTentativas) {
            System.out.print("Tentativa " + (tentativa + 1) + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            // Verifica se o palpite está correto
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é maior do que o número.");
            } else {
                System.out.println("Seu palpite é menor do que o número.");
            }

            tentativa++;

            // Se acabar as tentativas
            if (tentativa == maxTentativas) {
                System.out.println("Fim de jogo! O número correto era " + numeroAleatorio + ".");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
