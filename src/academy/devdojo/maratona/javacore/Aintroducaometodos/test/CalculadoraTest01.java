package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        System.out.println("soma " + calculator.somaDoisNumeros(98, 10));
        System.out.println("subtração " + calculator.subtraiDoisNumeros(98, 10));
        System.out.println("multiplicação " + calculator.multiplicaDoisNumeros(98, 10));
        System.out.println("divisão " + calculator.divideDoisNumeros(0, 10));
    }
}
