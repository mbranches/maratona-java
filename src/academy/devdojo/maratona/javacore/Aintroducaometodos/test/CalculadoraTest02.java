package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculator.alteraDoisNumeros(num1, num2); //não altera os valores da variável global
    }
}
