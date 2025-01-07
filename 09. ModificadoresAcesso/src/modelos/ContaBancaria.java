package modelos;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    // Getter e Setter para número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Getter e Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    // Metodo main para testar a classe
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João Silva";
        conta.setNumeroConta(12345);
        conta.setSaldo(1500.00);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
