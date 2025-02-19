package academy.devdojo.maratona.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
                                            //passando 0, o desempenho é melhor
        Integer[] integers = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        System.out.println();

        Integer[] numerosArrays = new Integer[3];
        numerosArrays[0] = 1;
        numerosArrays[1] = 2;
        numerosArrays[2] = 3;

        //o array fica ligado com a list
        List<Integer> listIntegers = Arrays.asList(numerosArrays);
        listIntegers.set(1, 12);
        System.out.println(listIntegers);
        System.out.println(Arrays.toString(numerosArrays));
//        System.out.println(listIntegers.add(13)); -> levanta erro
        System.out.println();

        //jeito mais pratico

        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numerosArrays));
        arrayToList.add(13);
        System.out.println(arrayToList);
        System.out.println(Arrays.toString(numerosArrays));

        System.out.println();

//        List<Integer> listaIniciadaComValores = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> listaIniciadaComValores = List.of(1, 2, 3, 4);
        System.out.println(listaIniciadaComValores);
    }
}
