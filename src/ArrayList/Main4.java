package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> family = new ArrayList<>();

        try {
            System.out.println("quantas pesssoas vc mora em casa?");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o nome:");
                String name = scanner.nextLine();
                System.out.println("Digite a idade:");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("O que você é do Izequiel?");
                String parente = scanner.nextLine();

                family.add(new Pessoa(name, age, parente));
            }
        } catch (Exception e) {
            System.out.println("Digite corretamente!");
        }
        scanner.close();

        for(Pessoa pessoas: family){
            System.out.println(pessoas.name + "-" + pessoas.age + "anos -" + pessoas.parente);
        }


    }


}
