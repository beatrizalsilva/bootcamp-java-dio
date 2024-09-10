package mensagem;

// serviço se torna a classe "genérica" pai, o msn e telegram herdam sua lógica
public abstract class ServicoDeMensagem {
    // tornando os métodos abstratos, cada serviço vai implementar sua funcionalidade
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // encapsulamento com a palavra protected garante que apenas as classes filhas saberam desses métodos
    protected void conexaoInternet() {
        System.out.println("Validando se a conexão com a internet está estável.");
    }

    protected void salvarHistorico() {
        System.out.println("Salvando histórico de mensagem.");
    }
}