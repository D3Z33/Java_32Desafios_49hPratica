package br.com.dezee.conversor;

// Implementação da interface ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CAMBIO = 4.94;  // Exemplo de taxa de câmbio

    // Método que converte dólar para real
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_CAMBIO;
    }

    // Teste da classe
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        double valorEmDolar = 150;  // Valor para teste
        double valorConvertido = conversor.converterDolarParaReal(valorEmDolar);

        System.out.println("Valor em dólar: $" + valorEmDolar);
        System.out.println("Valor convertido em reais: R$ " + valorConvertido);
    }
}
