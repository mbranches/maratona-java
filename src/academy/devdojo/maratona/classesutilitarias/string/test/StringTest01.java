package academy.devdojo.maratona.classesutilitarias.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; //String constant  pool
        String nome2 = "Willian";
        System.out.println(nome == nome2); //ou seja, ambos fazem referência ao mesmo objeto em memoria
        nome.concat("Suane");
        System.out.println(nome); //String são

        System.out.println();

        String nome3 = new String("Willian");
        System.out.println(nome2 == nome3); //nome 3 agora não pega mais a string da pool string diretamente e sim faz referencia a um objeto que puxa da pool string
        System.out.println(nome2 == nome.intern());
    }
}
