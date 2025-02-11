package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public class FileLoader implements Dataloader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissão no arquivo");
    }
}
