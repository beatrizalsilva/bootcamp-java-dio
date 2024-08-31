public class Contagem {
    public static void main(String[] args) {
        int contagem = 10;

        System.out.println("Prepare a Millennium Falcon para o hiperespaço!");

        while (contagem > 0) {
            System.out.println("Em " + contagem + " segundos...");
            contagem--;
        }
        System.out.println("Agora, Chewie! Vruummm");
    }
}