package academy.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };

    public abstract double calcularDesconto(double valor);
}
