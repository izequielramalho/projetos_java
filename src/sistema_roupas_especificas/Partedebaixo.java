package sistema_roupas_especificas;

public class Partedebaixo extends Roupa implements Trajes {

    private final int limitedetamanho = 39;


    public Partedebaixo(String cor, String tamanho, String tecido) {
        super(cor, tamanho, tecido);
    }

    @Override
    public void comprar() {
        System.out.println("comprar so se tiver o N 39");

    }

    @Override
    public void achar() {
        System.out.println("achando a minha parte de baixo no guarda-roupa");
    }

    @Override
    public void vestir() {
        System.out.println("vestindo a minha parte de baixo");
        System.out.println("tamanho atual" + this.limitedetamanho);

    }

    @Override
    public void dobrar() {
        System.out.println("dobrando a parte de baixo");

    }

    @Override
    public void guardar() {
        System.out.println("guardando a parte de baixo");

    }
}
