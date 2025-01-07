import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Inicialização dos dados do cliente
        String nomeCliente = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.0;

        // Exibe dados iniciais do cliente
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        // Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        // Loop para exibir o menu e capturar a opção
        while (true) {
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("\nDigite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = receberValor(scanner, saldo);
                    break;
                case 3:
                    saldo = transferirValor(scanner, saldo);
                    break;
                case 4:
                    System.out.println("Encerrando aplicação. Até mais!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Método para consultar saldo
    public static void consultarSaldo(double saldo) {
        System.out.println("\nSaldo atual: R$ " + saldo);
    }

    // Método para receber valor e atualizar saldo
    public static double receberValor(Scanner scanner, double saldo) {
        System.out.print("Informe o valor a receber: ");
        double valorRecebido = scanner.nextDouble();
        saldo += valorRecebido;
        System.out.println("\nSaldo atualizado: R$ " + saldo);
        return saldo;
    }

    // Método para transferir valor
    public static double transferirValor(Scanner scanner, double saldo) {
        System.out.print("Informe o valor que deseja transferir: ");
        double valorTransferencia = scanner.nextDouble();

        if (valorTransferencia <= saldo) {
            saldo -= valorTransferencia;
            System.out.println("\nTransferência realizada com sucesso.");
            System.out.println("Saldo atualizado: R$ " + saldo);
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        }
        return saldo;
    }
}
