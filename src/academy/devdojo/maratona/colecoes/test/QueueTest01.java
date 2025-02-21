package academy.devdojo.maratona.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); // precisa de um comparable ou comparator, ordena para ações(ex:remoção), porém não para prints

        fila.add("C");
        fila.add("B");
        fila.add("A");

        while (!fila.isEmpty()) {
//            System.out.println(fila.peek()); //retorna o primeiro elemento
            System.out.println(fila.poll()); //retorna o primeiro removendo
        }
        System.out.println(fila);
    }
}
