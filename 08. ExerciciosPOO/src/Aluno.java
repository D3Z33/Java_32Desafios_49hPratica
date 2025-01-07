package modelos;

public class Aluno {
    String nome;
    int idade;

    // Metodo para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas Almeida";
        aluno.idade = 20;

        aluno.exibirInformacoes();
    }
}
