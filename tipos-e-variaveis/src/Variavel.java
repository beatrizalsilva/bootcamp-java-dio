public class Variavel {
    public static void main(String[] args) {
        // regra: tipo + nome + valor
		int numero = 5;
        numero = 10; // alteração no valor da variável
		
        // usa-se a palavra 'final' para declarar uma constante e por convenção deve ser escrita em caixa alta
		final double VALOR_DE_PI = 3.14;
		
        // VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
        
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);
    }
}
