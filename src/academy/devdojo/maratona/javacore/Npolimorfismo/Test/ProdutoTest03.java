package academy.devdojo.maratona.javacore.Npolimorfismo.Test;

import academy.devdojo.maratona.javacore.Npolimorfismo.Servico.CalculadoraImposto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("cereja", 10);

        tomate.setDataValidade("29/10/2023");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
