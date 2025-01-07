package br.com.dezee.principal;

import br.com.dezee.model.Pessoa;
import br.com.dezee.model.Livro;
import br.com.dezee.model.Editora;

public class Main {
    public static void main(String[] args) {

        // JSON representando uma Pessoa
        String jsonPessoa = """
                {
                    "nome": "Renan",
                    "idade": 24,
                    "cidade": "São Paulo"
                }
                """;

        // Converte JSON para Objeto Pessoa
        Pessoa pessoa = JsonUtils.fromJson(jsonPessoa, Pessoa.class);

        // Exibe os dados do objeto Pessoa
        System.out.println("==== Pessoa ====");
        System.out.println("Nome: " + pessoa.nome());
        System.out.println("Idade: " + pessoa.idade());
        System.out.println("Cidade: " + pessoa.cidade());

        // JSON representando um Livro (com Editora)
        String jsonLivro = """
                {
                    "titulo": "Java: A Beginner's Guide",
                    "autor": "Herbert Schildt",
                    "editora": {
                        "nome": "McGraw-Hill",
                        "cidade": "New York"
                    }
                }
                """;

        // Converte JSON para Objeto Livro
        Livro livro = JsonUtils.fromJson(jsonLivro, Livro.class);

        // Exibe os dados do objeto Livro
        System.out.println("\n==== Livro ====");
        System.out.println("Título: " + livro.titulo());
        System.out.println("Autor: " + livro.autor());
        System.out.println("Editora: " + livro.editora().nome());
        System.out.println("Cidade da Editora: " + livro.editora().cidade());
    }
}