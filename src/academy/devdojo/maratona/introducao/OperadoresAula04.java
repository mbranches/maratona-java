package academy.devdojo.maratona.introducao;

public class OperadoresAula04 {
    public static void main(String[] args) {
        // operadores aritméticos: + - * /
        int numero1 = 10;
        double numero2 = 20;
        double divisao = numero1 / numero2; //a divisao entre dois numeros inteiro é inteiro tambem
        //System.out.println("a partir do proximo '+' ele se tornara apenas de concatenação "+numero2 + numero1);
        //System.out.println(numero2 + numero1 +" a partir do anterior(mais proximo) '+' se tornara apenas de concatenação "+numero2 + numero1);
        //System.out.println(divisao);

        int resto = 20 % 2;
        //System.out.println(resto);

        // operadores relacionais: >< == <= >= != //não pode comparar numero e string

        boolean isDezMaiorQue20 = 10 > 20;
        boolean isDezMenorQue20 = 10 < 20;
        boolean isDezIgual20 = 10 == 20;
        boolean isDezDiferente20 = 10 != 20;
        System.out.println("10 é maior que 20: " + isDezMaiorQue20);
        System.out.println("10 é menor que 20: " + isDezMenorQue20);
        System.out.println("10 é igual a 20: " + isDezIgual20);
        System.out.println("10 é diferente de 20: " + isDezDiferente20);
    }

    // operadores logicos: &&(and) ||(or) !(not)
}
