package academy.devdojo.maratona.javacore.Minterfaces.testes;

import academy.devdojo.maratona.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.Dataloader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        fileLoader.checkPermission();
        databaseLoader.checkPermission();

        DatabaseLoader.retriveMaxDataSize();
        Dataloader.retriveMaxDataSize();
    }
}
