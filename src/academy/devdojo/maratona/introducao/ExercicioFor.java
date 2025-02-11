package academy.devdojo.maratona.introducao;

public class ExercicioFor {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 a 1_000_000
        for (int i=0; i <=1_000_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
