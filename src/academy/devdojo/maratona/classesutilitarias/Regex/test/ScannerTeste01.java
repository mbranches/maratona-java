package academy.devdojo.maratona.classesutilitarias.Regex.test;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, mikasa, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
