package academy.devdojo.maratona.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    //para utilizar o binary search a lista precisa estar ordenada
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // se o buscado não existir -> (-(ponto de inserção) - 1)
        Collections.sort(numeros);
        System.out.println(numeros);
        System.out.println(Collections.binarySearch(numeros, 3));

        System.out.println(Collections.binarySearch(numeros, 1)); //para saber a posição, a qual ele deveria ser inserido basta somar 1 e multiplicar por -1 (resultado = 1)
    }

}
