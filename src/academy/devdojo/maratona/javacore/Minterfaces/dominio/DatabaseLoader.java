package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public class DatabaseLoader implements Dataloader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro da databaseloader");
    }
}
