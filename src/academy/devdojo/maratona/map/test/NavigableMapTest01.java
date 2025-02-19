package academy.devdojo.maratona.map.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();  //ordena pela chave
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        map.put("B", "Letra B");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(map.headMap("C", true)); //-> todo mundo que está antes da chave; está diretamente ligado com o map original; por padrão o inclusive é false
    }
}
