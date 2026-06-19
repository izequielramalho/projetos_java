package sistema_restaurante;

public class PratoPrincipal extends Pratos implements cardapio{

    public PratoPrincipal(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public void preparar() {
        System.out.println("preparar os pedidos que foram efetuados");

    }

    @Override
    public void servir() {
        System.out.println("servir o" + this.nome);

    }

    @Override
    public double cobrar() {
        return this.preco;
    }
}
