package mensagem;

public class Usuario {
    public static void main(String[] args) {
        System.out.println("Usando o APP Telegram");
        Telegram telegram = new Telegram();
        
        telegram.receberMensagem();
        telegram.enviarMensagem();

        System.out.println("Usando o APP MSN");
        MSN msn = new MSN();

        msn.receberMensagem();
        msn.enviarMensagem();
    }
}
