package modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Metodo para verificar se é maior de idade
    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
    }

    // Teste da classe
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(20);

        pessoa.verificarIdade();
    }
}
