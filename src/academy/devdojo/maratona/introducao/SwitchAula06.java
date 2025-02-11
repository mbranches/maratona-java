package academy.devdojo.maratona.introducao;

public class SwitchAula06 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando um como domingo
        byte dia = 10;

        //char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
        }

        char sexo = 'M';
        switch (sexo) {
            default:
                System.out.println("Sexo Inválido");
                break;
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
        }
    }
}
