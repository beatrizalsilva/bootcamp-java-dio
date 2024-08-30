public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume(); //13
        System.out.println("Novo status -> Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual? " + smartTv.volume);

        smartTv.mudarCanal(26);
        System.out.println("Novo status -> Canal Atual? " + smartTv.canal);
    }
}