package academy.devdojo.maratona.generics.test;

import academy.devdojo.maratona.generics.domain.Carro;
import academy.devdojo.maratona.generics.service.CarroRentavelService;

public class ClasseGenericaTest01{
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Utilizando carro p 1 mes....");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
