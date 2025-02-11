package academy.devdojo.maratona.introducao;

public class OperadoresTernariosAula05 {
    public static void main(String[] args) {
        //Doar se salário > 5000

        double salario = 6000;
        String mensagemDoar = "Vou doar 500ão";
        String mensagemNãoDoar = "Não tenho condições de doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
    }
}
