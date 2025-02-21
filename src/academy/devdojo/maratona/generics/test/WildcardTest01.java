package academy.devdojo.maratona.generics.test;

import java.util.List;

abstract class Animal {
    public abstract void cosulta();
}

class Cachorro extends Animal {
    @Override
    public void cosulta() {
        System.out.println("consultando cachorro...");
    }
}

class Gato extends Animal {
    @Override
    public void cosulta() {
        System.out.println("consultando gato...");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }
                                    //independente da lista ser de uma interface ou class sempre será extends
    private static void printConsulta(List<? extends Animal> animals) {
        //se torna apenas de leitura
        //para evitar erros como:
//        Animal cachorro = new Cachorro();
//        Animal gato = new Gato();
//        animals.add(cachorro);
//        animals.add(gato);


        for (Animal animal : animals) {
            animal.cosulta();
        }

    }
}
