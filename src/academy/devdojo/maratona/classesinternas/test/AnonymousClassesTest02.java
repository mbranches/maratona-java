package academy.devdojo.maratona.classesinternas.test;

import academy.devdojo.maratona.generics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> boatList = new ArrayList<>(List.of(new Barco("lancha"), new Barco("canoa")));
//        boatList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        boatList.sort(new Comparator<Barco>() {

            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(boatList);
    }
}
