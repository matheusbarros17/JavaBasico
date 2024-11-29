package construtores.application;

import poo.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;

        System.out.println("Enter account number: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter account holder: ");
        String titular = scanner.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char op = scanner.next().charAt(0);

        if (op == 'y') {
            System.out.println("Enter initial deposit value: ");
            double depositoInicial = scanner.nextDouble();
            conta = new Conta(numeroConta, titular, depositoInicial);
        }else{
            conta = new Conta(numeroConta, titular);

        }

        System.out.println(conta.toString());
        System.out.println("\nEnter a deposit value: ");
        double deposito = scanner.nextDouble();
        conta.deposito(deposito);

        System.out.println("Updated account data: ");
        System.out.println(conta.toString());

        System.out.println("\nEnter a withdraw value: ");
        double saque = scanner.nextDouble();
        conta.saque(saque);

        System.out.println("Updated account data: ");
        System.out.println(conta.toString());
    }
}
