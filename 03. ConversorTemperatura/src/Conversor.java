import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        int temperaturaInteira = (int) temperaturaFahrenheit;
        System.out.println("Temperatura em Fahrenheit (sem decimais): " + temperaturaInteira);
    }
}
