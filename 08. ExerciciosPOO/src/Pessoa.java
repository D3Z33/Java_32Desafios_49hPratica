package modelos;

public class Pessoa {
    // Metodo para exibir "Olá, mundo!"
    public void saudacao() {
        System.out.println("Olá, mundo!");
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();
    }
}
