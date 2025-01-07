package br.com.dezee.carro;

// Subclasse ModeloCarro que herda de Carro
public class ModeloCarro extends Carro {

    // Metodo específico da subclasse para exibir todas as informações
    public void exibirInformacoes() {
        exibirMenorPreco();
        exibirMaiorPreco();
    }

    // Testando a subclasse com a classe principal
    public static void main(String[] args) {
        ModeloCarro civic = new ModeloCarro();
        civic.setModelo("Honda Civic");
        civic.definirPrecos(120000, 110000, 130000);
        civic.exibirInformacoes();
    }
}
