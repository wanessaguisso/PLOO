package ex02;

import bibliotecas.BibLista;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/*
 * 2 – Crie uma lista com 20 números inteiros.
 *     Crie uma segunda lista retirando os números repetidos
 *     e ordenando os elementos. Em seguida, inverta a ordem
 *     dos elementos da segunda metade dessa lista.
 *     Exemplo:
 *     Lista 1 = 1 6 3 5 4 1 3 8
 *     Lista 2 = 1 3 4 8 6 5
 */
public class ordemEInversao {

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2;

        // Preenche lista1 usando a biblioteca
        BibLista.preencher(lista1);
        

        // Retira repetidos com HashSet e cria lista2
        lista2 = new LinkedList<>(new HashSet<>(lista1));

        // Ordena lista2
        Collections.sort(lista2);

        // Inverte apenas a segunda metade
        int meio = lista2.size() / 2;
        LinkedList<Integer> primeiraMetade = new LinkedList<>(lista2.subList(0, meio));
        LinkedList<Integer> segundaMetade = new LinkedList<>(lista2.subList(meio, lista2.size()));
        Collections.reverse(segundaMetade);

        // Junta metades de volta
        lista2.clear();
        lista2.addAll(primeiraMetade);
        lista2.addAll(segundaMetade);

        // Exibe resultados
        System.out.println("LISTA1");
        System.out.println(lista1);
        System.out.println("LISTA 2");
        System.out.println(lista2);
    }
}
