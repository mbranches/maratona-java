package academy.devdojo.maratona.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonusSalarial();
    }

    public abstract void calculaBonusSalarial();

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }
}
