
package sistema_academia;

public class Aluno {

    String nome;
    double peso;
    double altura;
    int plano;

    public Aluno(String nome, double peso, double altura, int plano) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.plano = plano;
    }

    public void treinar() {

        System.out.println(this.nome + "treinar de segunda a sexta");


    }

    public void pesar() {

        if (peso >= 70) {
            System.out.println(this.nome + "fazer um treino mais leve");
        } else {
            System.out.println(this.nome + "fazer um treino mais intenso");
        }

    }

    public void renovarPlano() {

        System.out.println(this.nome +"o plano deve ser renovado no final do mês");

    }

}
