package academy.devdojo.maratona.generics.test;

import academy.devdojo.maratona.generics.domain.Barco;
import academy.devdojo.maratona.generics.domain.Carro;
import academy.devdojo.maratona.generics.service.CarroRentavelService;
import academy.devdojo.maratona.generics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        RentavelService<Carro> carroRentavelService = new RentavelService<>(carrosDisponiveis);

        Carro carro = carroRentavelService.buscarVeiculoDisponivel();
        System.out.println("Utilizando carro p 1 mes....");
        carroRentavelService.retornarVeiculoAlugado(carro);

        System.out.println();
        System.out.println();
        System.out.println();

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Lancha")));
        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcosDisponiveis);

        Barco barco = barcoRentavelService.buscarVeiculoDisponivel();
        System.out.println("Utilizando barco p 1 mes....");
        barcoRentavelService.retornarVeiculoAlugado(barco);
    }
}
