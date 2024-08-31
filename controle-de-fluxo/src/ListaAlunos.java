public class ListaAlunos {
    public static void main(String[] args) {
        // o for interage com coleções e arrays
        String alunos[] = { "Felipe", "Jonas", "Marcos", "João" };
        
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}
