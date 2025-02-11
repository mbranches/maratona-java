package academy.devdojo.maratona.excecoes.exceptions.test;

import academy.devdojo.maratona.excecoes.exceptions.dominio.Funcionario;
import academy.devdojo.maratona.excecoes.exceptions.dominio.LoginInvalidoException;
import academy.devdojo.maratona.excecoes.exceptions.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptiomTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
