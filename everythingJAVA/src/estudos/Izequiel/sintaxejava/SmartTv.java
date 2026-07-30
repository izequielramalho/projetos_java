package estudos.Izequiel.sintaxejava;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando canal Atual:" + canal);
    }

    public void aumentaCanal() {
        canal++;
        System.out.println("Aumentando o canal atual:" + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal atual:" + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume atual:" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume atual:" + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}


