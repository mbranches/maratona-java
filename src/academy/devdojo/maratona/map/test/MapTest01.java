package academy.devdojo.maratona.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //  key     value
//        Map<String, String> map = new HashMap<>(); // não pode ter chave duplicadas; ordena os itens
        Map<String, String> map = new LinkedHashMap<>(); // preserva a ordem da inserção
        map.put("teklado", "teclado");
        map.put("mauze", "mouse");
        map.put("vc", "voce2");
        map.put("vc", "voce"); //ele sobrescreve se ja existir a chave
        map.putIfAbsent("vc", "voce3"); //só da um "put" se a key não existir

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        for (Map.Entry<String , String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue( ));
        }
    }
}
