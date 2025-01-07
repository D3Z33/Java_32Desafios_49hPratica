public class DesafioVariaveis {
    public static void main(String[] args) {

        // 1. Cálculo da média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2. Casting de double para int
        double valorDouble = 9.7;
        int valorInt = (int) valorDouble;
        System.out.println("Valor inteiro (casting de double para int): " + valorInt);

        // 3. Concatenação de char e String
        char inicial = 'A';
        String mensagem = "luno de Java";
        System.out.println("Mensagem: " + inicial + mensagem);

        // 4. Cálculo do valor total de um produto
        double precoProduto = 29.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total do produto: R$ " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double taxaCambio = 4.94;
        double valorEmReais = valorEmDolares * taxaCambio;
        System.out.println(String.format("Valor em reais: R$ %.2f", valorEmReais));


        // 6. Cálculo de desconto sobre o preço original
        double precoOriginal = 120.0;
        double percentualDesconto = 15.0;  // 15% de desconto
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}
