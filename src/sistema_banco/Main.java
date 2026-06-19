package sistema_banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("digite o titular da conta corrente:");
            String titular = scanner.nextLine();
            System.out.println("digite o saldo:");
            double saldo = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("digite o titular da poupanca:");
            String titular2 = scanner.nextLine();
            System.out.println("digite o saldo:");
            double saldo2 = scanner.nextDouble();
            scanner.nextLine();


            Transacao t1 = new ContaCorrente(titular, saldo, 123456);
            Transacao t2 = new Poupanca(titular2, saldo2, 123456);
            Transacao t3 = new ContaCorrente(titular, saldo, 54321);
            Transacao t4 = new Poupanca(titular2, saldo2, 54321);

            Transacao[] dinheiro = {t1, t2, t3, t4};

            for (Transacao money : dinheiro) {

                money.depositar();
                money.sacar();
                money.transferir();
            }


        } catch (Exception e){
            System.out.println("Valor inválido! digite o um número válido!");
        }


        scanner.close();
    }
}
