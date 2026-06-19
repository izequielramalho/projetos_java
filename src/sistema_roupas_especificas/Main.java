package sistema_roupas_especificas;

public class Main {

    public static void main(String[] args) {

        Trajes calca = new Partedebaixo("azul","m","jeans");
        Trajes camiseta = new Partedecima("preta","M","algodao");
        Trajes tenis = new Partedebaixo("preto e branco","39","carmusa");

        Trajes[] minhasroupas = {calca, camiseta, tenis};

        for(Trajes roupa: minhasroupas){

            roupa.comprar();
            roupa.achar();
            roupa.vestir();
            roupa.dobrar();
            roupa.guardar();


        }
    }
}

