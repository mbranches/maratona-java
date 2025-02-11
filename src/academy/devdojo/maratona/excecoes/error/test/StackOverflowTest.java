package academy.devdojo.maratona.excecoes.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursivo();
    }

    public static void recursivo() {
        recursivo();
    }
}
