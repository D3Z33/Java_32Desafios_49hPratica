package br.com.dezee.numerosprimos;

// Superclasse NumerosPrimos
public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
