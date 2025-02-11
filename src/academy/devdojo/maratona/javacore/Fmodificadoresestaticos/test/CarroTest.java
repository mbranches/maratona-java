package academy.devdojo.maratona.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratona.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);


        Carro.setVelocidadeLimite(200);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
