package academy.devdojo.maratona.excecoes.exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        boolean criado = file.createNewFile();
        System.out.println("Arquivo criado " + criado);
    }
}
