package academy.devdojo.maratona.generics.test;

import academy.devdojo.maratona.generics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        Barco barco = new Barco("Canoa");
        Barco barco1 = new Barco("lancha");
        System.out.println(criarArrayComUmObjeto(barco1, barco));
    }

    private static <T> List<T> criarArrayComUmObjeto(T ...t) {
        List<T> list = new ArrayList<>(List.of(t));
        return list;
    }
}
