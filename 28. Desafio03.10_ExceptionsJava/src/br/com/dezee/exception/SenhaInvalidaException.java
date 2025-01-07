package br.com.dezee.exception;

// Exceção personalizada que estende RuntimeException
public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}