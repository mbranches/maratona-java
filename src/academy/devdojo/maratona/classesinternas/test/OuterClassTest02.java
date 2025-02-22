package academy.devdojo.maratona.classesinternas.test;

public class OuterClassTest02 {
    private String name = "Marcus Vinicius";

    void print(String parametro) {
        String lastName = "Branches"; // ->  final String lastName = "Branches";
//        lastName = "m"; -> vai levantar erro
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName); // para utilizar aq a class tem q ser efetivamente final
                System.out.println(parametro);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print("parametro");
    }
}
