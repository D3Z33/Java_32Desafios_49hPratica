package modelos;

public class Aluno {
    private String nome;
    private double[] notas;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Teste da classe
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setNotas(new double[]{8.5, 7.0, 9.0});

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média das notas: " + aluno.calcularMedia());
    }
}
