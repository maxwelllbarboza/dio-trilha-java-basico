import entitie.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        Conta conta = new Conta(numero,agencia, nomeCliente, saldo);
        conta.exibirMensagem();

    }
}