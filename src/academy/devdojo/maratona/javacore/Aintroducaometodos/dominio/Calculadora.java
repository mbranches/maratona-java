package academy.devdojo.maratona.javacore.Aintroducaometodos.dominio;

public class Calculadora {
//  acesso return     name
    public double somaDoisNumeros(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraiDoisNumeros(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicaDoisNumeros(double num1, double num2) {
        return num1 * num2;
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do altera dois numeros: ");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
