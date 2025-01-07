package br.com.dezee.contabancaria;

// Subclasse ContaCorrente que herda de ContaBancaria
public class ContaCorrente extends ContaBancaria {

    // Metodo para cobrar tarifa mensal
    public void cobrarTarifaMensal() {
        double tarifa = 20.0;
        saldo -= tarifa;
        System.out.println("Tarifa mensal de R$ " + tarifa + " cobrada.");
    }

    // Teste do metodo principal
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000);
        conta.sacar(300);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();
    }
}
