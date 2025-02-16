package academy.devdojo.maratona.serializacao.teste;

import academy.devdojo.maratona.serializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializacao01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Marcus", "Marcus123");
//        serializar(aluno);
        System.out.println(deserializar());
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Aluno deserializar() {
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            return aluno;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
