package academy.devdojo.maratona.javacore.Npolimorfismo.Test;

import academy.devdojo.maratona.javacore.Npolimorfismo.Servico.CalculadoraImposto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Asus Y5", 5000);
        Tomate tomate = new Tomate("Tomate Maçã", 10);
        Televisao tv = new Televisao("Samsung 4k 50\"", 4500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("================================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("================================");
        CalculadoraImposto.calcularImposto(tv);

    }
}
