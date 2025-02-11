package academy.devdojo.maratona.introducao;

public class ExercicioOperadoresTernarios {
    public static void main(String[] args) {
        //ate 30000 anuais 10% de taxa
        //de 30 a 100k 20%
        //acima de 100k 30%
        double salarioAnual = 25000;
        double taxa;

        if (salarioAnual < 30000) {
            taxa = 0.10 * salarioAnual;
        } else if (salarioAnual < 100_000) {
            taxa = 0.2 * salarioAnual;
        } else {
            taxa = 0.3 *salarioAnual;
        }

        System.out.println("Valor da taxa a ser pago é: R$" + taxa);
    }
}
