package modelos;

public class Carro {
    String modelo;
    int ano;
    String cor;

    // Metodo para exibir ficha técnica
    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do carro: " + calcularIdade() + " anos");
    }

    // Metodo para calcular a idade do carro
    public int calcularIdade() {
        int anoAtual = 2024;
        return anoAtual - ano;
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.ano = 2018;
        carro.cor = "Prata";

        carro.exibirFichaTecnica();
    }
}
