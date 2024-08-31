public class BreakContinue {
    public static void main(String[] args) {
        // o comando break interrompe o laço, já o continue interrompe somente a iteração atual
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                // break para no 2
                continue; // para no 3, mas continua a partir do 4
            }
            System.out.println(numero);
        }
    }
}