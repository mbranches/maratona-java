package academy.devdojo.maratona.javacore.Jmodificadorfinal.Test;

import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Marcus");

        System.out.println(carro.COMPRADOR);
    }

}
