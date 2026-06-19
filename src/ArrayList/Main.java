package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.println("quantos alunos deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();
            System.out.println("digite a idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            alunos.add(new Aluno(nome, idade));
        }
        scanner.close();

    }
}
// Este aqui junta o ArrayList com o Scanner; diferente das outras class q eu criei aqui que são somente ArrayList.