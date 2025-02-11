package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public interface Dataloader {
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load(); // por padrão são public e abstract

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissão");
    }

    static void retriveMaxDataSize() {
        System.out.println("Dentro da interface");
    }
}
