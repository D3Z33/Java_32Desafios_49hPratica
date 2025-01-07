package modelos;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    // Metodo para exibir ficha técnica
    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação Média: " + calcularMedia());
    }

    // Metodo para adicionar avaliação
    public void avaliar(int nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    // Metodo para calcular a média de avaliações
    public double calcularMedia() {
        if (numAvaliacoes == 0) {
            return 0;
        }
        return (double) avaliacao / numAvaliacoes;
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.anoLancamento = 1975;

        musica.avaliar(5);
        musica.avaliar(4);
        musica.exibirFichaTecnica();
    }
}
