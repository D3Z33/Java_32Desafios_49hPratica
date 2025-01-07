package modelos;

public class Calculadora {
    // Metodo para calcular o dobro de um número
    public int calculaDobro(int numero) {
        return numero * 2;
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.calculaDobro(7);
        System.out.println("O dobro de 7 é: " + resultado);
    }
}
