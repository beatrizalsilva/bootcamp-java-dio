package mensagem;

// extends é a palavra reservada que indica que a classe está herando caracteristicas de outra
public class MSN extends ServicoDeMensagem {
    public void enviarMensagem() {
        conexaoInternet();
        System.out.println("Mensagem a caminho ...");
        salvarHistorico();
    }

    public void receberMensagem() {
        System.out.println("Você tem mensagens aqui!!");
    }
}