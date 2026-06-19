package sistema_roupa;

public class Roupa {

    String modelo;
    String tipo;
    String cor;

    public Roupa(String modelo, String tipo, String cor) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void vestir() {
        System.out.println("vestindo a roupa" + "," + this.modelo);
    }

    public void guardar() {
        System.out.println("guardando a roupa" + "," + this.modelo + "-" + this.tipo);
    }
}
