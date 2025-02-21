package academy.devdojo.maratona.generics.service;

import academy.devdojo.maratona.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> consultaCarrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponivel");
        Carro carro = consultaCarrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: " + consultaCarrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        consultaCarrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: " + consultaCarrosDisponiveis);
    }
}
