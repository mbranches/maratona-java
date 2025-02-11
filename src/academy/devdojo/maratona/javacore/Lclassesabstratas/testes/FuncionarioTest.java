package academy.devdojo.maratona.javacore.Lclassesabstratas.testes;

import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Vinicius", 2500);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcus Vinicius Lima Branches", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
