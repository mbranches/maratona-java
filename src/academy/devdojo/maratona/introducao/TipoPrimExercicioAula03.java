package academy.devdojo.maratona.introducao;

/*
    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereco>,
        confirmo que recebi o salário de <salario>, na data <data>
*/

public class TipoPrimExercicioAula03 {
        public static void main(String[] args) {
        String nome = "Marcus";
        String endereco = "Res.Paulo Fonteles 1";
        double salario = 8932.87;
        String data = "10/01/2027";
        String relatorio = "Eu " + nome+ ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data + ".";
        System.out.println(relatorio);
    }

    public static class SwitchExercicio {
        public static void main(String[] args) {
            // Dado os valor de 1 a 7, imprima se é dia útil ou final de semana
            byte dia = 7;

            switch (dia) {
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                case 7:
                    System.out.println("Fim de semana");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia útil");
                    break;
            }
        }
    }
}
