public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada:  " + smartTv.ligada);
        System.out.println("Canal atual:  " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.ligar();

        smartTv.desligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(200);

        System.out.println("Canal: " + smartTv.canal);

    }
}
