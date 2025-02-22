package academy.devdojo.maratona.classesinternas.test;

public class OuterClassTest01 {
    private String name = "Marcus Vinicius";

    class InnerClass {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); //nome mostrado por this é INNERCLASS
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printOuterClassAttribute();
    }
}
