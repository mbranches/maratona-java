package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(11, 4 ,6);
    }
}
