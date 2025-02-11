package academy.devdojo.maratona.classesutilitarias.Regex.test;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("integer: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }   
    }
}
