package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABCD", "Iphone");
        Smartphone smartphone2 = new Smartphone("12NNM", "Samsung");
        Smartphone smartphone3 = new Smartphone("JK1PM", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

//        for (Smartphone smartphone : smartphones) {
//            System.out.println(smartphone);
//        }

        Smartphone smartphone4 = new Smartphone("JK1PM", "Motorola");

        //contains utiliza o equals
        if (smartphones.contains(smartphone4)) System.out.println("Error! IMEI já cadastrado.");

        System.out.println(smartphones.indexOf(smartphone4));

        System.out.println(smartphones);

        System.out.println();

        Smartphone smartphone5 = new Smartphone("a121", "Lenovo");
        smartphones.add(0, smartphone5);

        System.out.println(smartphones);
    }
}
