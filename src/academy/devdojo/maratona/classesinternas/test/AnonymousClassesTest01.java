package academy.devdojo.maratona.classesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

//class Dog extends Animal {
//    @Override
//    public void walk() {
//        System.out.println("Dog walking");
//    }
//}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ //subclass de animal
            @Override
            public void walk() {
                System.out.println("walking in the shadow");
                jump();
            }

            public void jump() { //esse metodo so pode ser utilizado por metodos sobrescritos ou sobrecarregados, fora da classe anonima nunca
                System.out.println("jumping");
            }
        };
        animal.walk();
    }
}
