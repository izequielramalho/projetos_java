package sistema_roupa;

public class Main {

    public static void main(String[] args) {

        Roupa minhaROUPA = new Roupa("touca", "ninja", "cinza");
        Roupa minhaROUPA1 = new Roupa("regata", "aberta", "preta");
        Roupa minhaROUPA2 = new Roupa("camiseta", "polo", "azul escuro");

        Roupa[] minhasroupas = {minhaROUPA, minhaROUPA1, minhaROUPA2};

        for(Roupa roupas: minhasroupas){

            roupas.vestir();
            roupas.guardar();


        }
    }
}






