package academy.devdojo.maratona.excecoes.exceptions.test;

import academy.devdojo.maratona.excecoes.exceptions.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameBD = "Goku";
        String senhaBD = "g123";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDigitado.equals(usernameBD) || !senhaDigitada.equals(senhaBD)) {
            throw new LoginInvalidoException();
        }

        System.out.println("Usuário logado com sucesso.");
    }
}
