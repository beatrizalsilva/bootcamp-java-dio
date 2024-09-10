package mensagem;

public class Telegram extends ServicoDeMensagem {
    // polimorfismo permite que as classes filhas modifiquem (sobrescreva) comportamentos herdados
    public void enviarMensagem() {
        conexaoInternet();
        System.out.println("Aviãozinho pronto para decolar ... Mensagem a caminho do destino.");
        salvarHistorico();
    }

    public void receberMensagem() {
        System.out.println("Aviãozinho pousou, cheque caixa de mensagem.");
    }
}