package br.com.dezee.carro;

// Superclasse Carro
public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    // Metodo para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodo para definir os preços dos três anos
    public void definirPrecos(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    // Metodo para calcular e exibir o menor preço
    public void exibirMenorPreco() {
        double menor = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        System.out.println("Menor preço do modelo " + modelo + ": R$ " + menor);
    }

    // Metodo para calcular e exibir o maior preço
    public void exibirMaiorPreco() {
        double maior = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        System.out.println("Maior preço do modelo " + modelo + ": R$ " + maior);
    }
}
