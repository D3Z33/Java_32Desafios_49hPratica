package br.com.dezee.numerosprimos;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int atual) {
        int proximo = atual + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
