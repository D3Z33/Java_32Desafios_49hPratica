package modelos;

public class Produto {
    private String nome;
    private double preco;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo para aplicar desconto
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto aplicado. Novo preço: R$ " + preco);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    // Teste da classe
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3500.00);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());

        produto.aplicarDesconto(10);
    }
}
