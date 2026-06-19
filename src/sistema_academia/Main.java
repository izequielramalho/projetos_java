package sistema_academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("aluno 1");
            System.out.println("digite o seu nome completo:");
            String nome1 = scanner.nextLine();
            System.out.println("digite o seu peso:");
            double peso1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("digite a sua altura:");
            double altura1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("qual o melhor dia para o pagamento do seu plano?");
            int plano1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("aluno 2");
            System.out.println("digite o seu nome completo:");
            String nome2 = scanner.nextLine();
            System.out.println("digite o seu peso:");
            double peso2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("digite a sua altura:");
            double altura2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("qual o melhor dia para o pagamento do seu plano?");
            int plano2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("aluno 3");
            System.out.println("digite o seu nome completo:");
            String nome3 = scanner.nextLine();
            System.out.println("digite o seu peso:");
            double peso3 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("digite a sua altura:");
            double altura3 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("qual o melhor dia para o pagamento do seu plano?");
            int plano3 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("aluno 4");
            System.out.println("digite o seu nome completo:");
            String nome4 = scanner.nextLine();
            System.out.println("digite o seu peso:");
            double peso4 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("digite a sua altura:");
            double altura4 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("qual o melhor dia para o pagamento do seu plano?");
            int plano4 = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno1 = new Aluno(nome1, peso1, altura1, plano1);
            Aluno aluno2 = new Aluno(nome2, peso2, altura2, plano2);
            Aluno aluno3 = new Aluno(nome3, peso3, altura3, plano3);
            Aluno aluno4 = new Aluno(nome4, peso4, altura4, plano4);

            Aluno[] allalunos = {aluno1, aluno2, aluno3, aluno4};

            for (Aluno alunos : allalunos) {

                alunos.treinar();
                alunos.pesar();
                alunos.renovarPlano();


            }
        }  catch (Exception e){
            System.out.println("digite a peso correto!");
        }
        scanner.close();

    }
}

