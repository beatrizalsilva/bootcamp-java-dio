public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        // só executa se a condição for verdadeira, caso contrário devolve o valor do saldo
       if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
       }

        System.out.println(saldo);
    }
}