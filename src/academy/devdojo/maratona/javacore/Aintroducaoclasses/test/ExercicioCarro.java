package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

// Crie uma Class, com os atributos: Nome, Marca e Ano. Em seguida crie dois objetos distintos e imprima seus valores.

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "Uno";
        car1.marca = "Fiat";
        car1.ano = 2010;

        car2.nome = "Civic";
        car2.marca = "Honda";
        car2.ano = 2022;

        //car1 = car2;

        System.out.println("Carro1:");
        System.out.print("Nome: " + car1.nome);
        System.out.print(", Marca: " + car1.marca);
        System.out.print(", Ano: " + car1.ano);

        System.out.println();
        System.out.println();

        System.out.println("Carro2:");
        System.out.print("Nome: " + car2.nome);
        System.out.print(", Marca: " + car2.marca);
        System.out.print(", Ano: " + car2.ano);
    }
}
