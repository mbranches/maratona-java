package academy.devdojo.maratona.excecoes.exceptions.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() {
        System.out.println("salvando funcionario");
    }
}
