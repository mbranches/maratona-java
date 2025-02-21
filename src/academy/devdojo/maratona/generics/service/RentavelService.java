package academy.devdojo.maratona.generics.service;

import academy.devdojo.maratona.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T> {
    private List<T> veiculosDisponiveis;

    public RentavelService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veículo disponivel");
        T veiculo = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veículo: " + veiculo);
        System.out.println("Veículos disponiveis para alugar: " + veiculosDisponiveis);
        return veiculo;
    }

    public void retornarVeiculoAlugado(T veiculo) {
        System.out.println("Devolvendo veículo: " + veiculo);
        veiculosDisponiveis.add(veiculo);
        System.out.println("Veículos disponiveis para alugar: " + veiculosDisponiveis);
    }
}
