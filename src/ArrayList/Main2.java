package ArrayList;

import java.security.PublicKey;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){

        ArrayList<String> listadecompra = new ArrayList<>();

        listadecompra.add("arroz");
        listadecompra.add("feijão");
        listadecompra.add("carne");
        listadecompra.add("salada");
        listadecompra.add("produto de limpeza");

        for(String compras:listadecompra){
            System.out.println(compras);
        }
    }

}
// ArrayList somente.