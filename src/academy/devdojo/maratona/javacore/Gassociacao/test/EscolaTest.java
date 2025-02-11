package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Cesar");
        Professor professor3 = new Professor("Maria");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Escola", professores);

        escola.imprime();
    }

}
