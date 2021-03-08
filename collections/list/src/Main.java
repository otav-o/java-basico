import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
    Collections: List, Queue e Set
    Implementações do java.util.List: ArrayList e Vector
 */

public class Main {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");

        System.out.println(nomes);

        /* Size */
        System.out.println("Tamanho: " + nomes.size());

        /* Sort */
        Collections.sort(nomes);

        System.out.println(nomes);

        /* Set: adiciona um valor a um índice */
        nomes.set(1, "Anderson"); // índice, novo valor

        System.out.println(nomes);

        /*
            .remove(indice) -> remove e retorna o elemento
            .remove(elemento) -> remove a primeira ocorrência (menor índice) e retorna true/false
         */
        nomes.remove("Miguel"); // false
        String nomeRemovido = nomes.remove(0);
        System.out.println(nomeRemovido);
        System.out.println(nomes);

        /* Foreach */
        for (String nomeDoItem : nomes) {
            System.out.println("Usando foreach: " + nomeDoItem);
        }

        /* Iterator */
        Iterator<String> i = nomes.iterator();
        while (i.hasNext())
            System.out.println("Usando iterator: " + i.next());

        /* contains(elemento) */
        System.out.println("Existe Alessandra na lista? " + nomes.contains("Alessandra"));

        /* isEmpty() */
        boolean listaEstaVazia = nomes.isEmpty();

        /* indexOf(elemento) */
        int posicao = nomes.indexOf("Carlos"); // retorna -1 se não existir

        nomes.clear();

        /* get(indice) */
        String nome = nomes.get(1); // índice que não existe: IndexOutOfBoundsException
    }
}
