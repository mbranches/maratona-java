package academy.devdojo.maratona.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto computador...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
