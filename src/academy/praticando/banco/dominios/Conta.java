package academy.praticando.banco.dominios;

public class Conta {
    private Cliente cliente;
    private double saldo = 0;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
