package br.com.dezee.temperatura;

// Implementação da interface ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    // Converte de Celsius para Fahrenheit
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    // Converte de Fahrenheit para Celsius
    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    // Teste da classe
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double tempCelsius = 30;
        double tempFahrenheit = 96;

        System.out.println(tempCelsius + "°C em Fahrenheit: " + conversor.celsiusParaFahrenheit(tempCelsius));
        System.out.println(tempFahrenheit + "°F em Celsius: " + conversor.fahrenheitParaCelsius(tempFahrenheit));
    }
}