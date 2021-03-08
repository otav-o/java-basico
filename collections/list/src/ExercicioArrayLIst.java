import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add(0, "Juliana");
        alunos.add(1, "Pedro");
        alunos.add(2, "Carlos");
        alunos.add(3, "Larissa");
        alunos.add(3, "João");
        // descobri que dá para passar um índice, mas não substitui (ocupa o lugar e desloca os posteriores para a direita)

        System.out.println(alunos);

        for (String n : alunos) System.out.println(n);

        alunos.set(alunos.indexOf("Carlos"), "Roberto");
        System.out.println(alunos);

        alunos.indexOf(1);

        alunos.remove(4);
        System.out.println(alunos);

        alunos.remove("João");

        int quantidade = alunos.size();
        System.out.println(quantidade);

        boolean temJuliano = alunos.contains("Juliano");

        List<String> alunos2 = new ArrayList<>();
        alunos2.add("Ismael");
        alunos2.add("Rodrigo");

        /* listaDestino.addAll(listaRemetente) */
        alunos.addAll(alunos2); // copia tudo de alunos 2
        System.out.println(alunos);

        Collections.sort(alunos); // não cria outra lista, modifica a de origem
        System.out.println(alunos);

    }
}
