package br.com.dezee.exception;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}