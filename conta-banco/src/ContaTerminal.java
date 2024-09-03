//importar a classe scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criar o objeto scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // exibir as mensagens para o usuário
        System.out.println("Bem-vindo(a) ao JavaBank! Estamos felizes em tê-lo(a) conosco. Para garantir uma experiência segura e personalizada, por favor, insira seus dados conforme solicitado. Estamos aqui para ajudá-lo(a) em cada passo!");

        // receber dados do usuário
        System.out.println("Digite seu nome");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o número da agência");
        String agencia = input.next();

        System.out.println("Digite o número da conta");
        int numeroConta = input.nextInt();

        System.out.println("Digite o saldo inicial");
        double saldoInicial = input.nextDouble();

        //exibir mensagem de conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldoInicial + " já está disponível para saque.");
        
        input.close();
    }
}