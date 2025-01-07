package br.com.dezee.desafios.contas;

import java.util.ArrayList;

public class ListaContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria(101, 2500.0));
        contas.add(new ContaBancaria(102, 5800.0));
        contas.add(new ContaBancaria(103, 3500.0));

        ContaBancaria maior = contas.get(0);

        for (ContaBancaria c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }

        System.out.println("Conta com maior saldo: " + maior);
    }
}