package sistema_restaurante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("qual o seu pedido?");
            String nome1 = scanner.nextLine();

            System.out.println("qual o seu pedido?");
            String nome2 = scanner.nextLine();

            System.out.println("qual o seu pedido?");
            String nome3 = scanner.nextLine();


            cardapio prato1 = new Entrada(nome1, 10, "Salgado");
            cardapio prato2 = new PratoPrincipal(nome2, 50, "Massa");
            cardapio prato3 = new Sobremesa(nome3, 15, "doce");

            cardapio[] allpedidos = {prato1, prato2, prato3};

            double total = 0;

            for (cardapio pedidos : allpedidos) {

                pedidos.preparar();
                pedidos.servir();
                total += pedidos.cobrar();

            }
            System.out.println("total da conta: " + total);

            if (total > 100) {
                System.out.println("10 reais de desconto");
            }
        } catch(Exception e){
            System.out.println("digite o nome do pedido corretamente!");
        }

        scanner.close();


    }
}
