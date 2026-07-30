package estudos.Izequiel.sintaxejava;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);

        smartTv.mudarCanal(13);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
    }
}
