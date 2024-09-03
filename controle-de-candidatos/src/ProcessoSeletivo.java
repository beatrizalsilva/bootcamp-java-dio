import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println("Processo Seletivo");
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    public static void analisarCandidato(double pretensaoSalarial) {
        double salarioBase = 2000.0;

        if (salarioBase > pretensaoSalarial) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == pretensaoSalarial) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    public static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Mirela", "Daniela", "Lucas", "João" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double pretensaoSalarial = valorPretendido();

            System.out.println("O candidado " + candidato + " solicitou este valor de salário " + pretensaoSalarial);
            if (salarioBase >= pretensaoSalarial) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        /**
         * forma abreviada com for each
         * for (String candidato: candidatos) {
         *  System.out.println("O candidato selecionado foi " + candidato);
         * }
        */
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", o número máximo de tentativas " + tentativasRealizadas + " realizada");
        }
    }

    // método auxiliar
    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}