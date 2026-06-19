package sistema_roupas_especificas;

public class Partedecima extends Roupa implements Trajes {

    private String limitedetamanho = "medio";

    public Partedecima(String cor, String tamanho, String tecido){

        super(cor, tamanho, tecido);
    }

    @Override
    public void comprar() {
            System.out.println("comprar so se tiver o tamanho");
    }

    @Override
    public void achar() {
        System.out.println("encontrando a minha parte de cima no guarda-roupa");

    }

    @Override
    public void vestir() {
        System.out.println("vestindo a minha parte de cima");
        System.out.println("usando a camiseta" + this.limitedetamanho);
    }

    @Override
    public void dobrar() {
        System.out.println("dobranddo a minha parte de cima");

    }

    @Override
    public void guardar() {
        System.out.println("guardando a minha parte de cima");

    }
}
