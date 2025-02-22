package academy.devdojo.maratona.classesinternas.test;

public class OuterClassTest03 {
    private String name = "nanan";

    static class Nested {
        private String lastName = "Silva";

        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();

        nested.print();
    }
}
