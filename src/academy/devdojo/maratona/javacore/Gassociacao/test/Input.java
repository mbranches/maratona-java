package academy.devdojo.maratona.javacore.Gassociacao.test;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão de futuro: ");
        System.out.println("Digite sua pergunta abaixo e direi sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
