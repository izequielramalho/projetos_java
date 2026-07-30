package estudos.Izequiel.firstweek;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Izequiel";
        String segundoNome = "Ramalho de Sousa Alves";
        int minhaIdade = 19;
        minhaIdade = 20;
        boolean verdadeira = true;


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);


    }
}
