public class Ternario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        /* pensar em uma estrutura condicional normal de if
            if(a==b) {
                resultado = "verdadeiro";
            } else {
                resultado = "falso";
            }
        */

        // aplicando a condição em ternário
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
