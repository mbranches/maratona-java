package academy.devdojo.maratona.excecoes.exceptions.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando pessoa");
    }
}
