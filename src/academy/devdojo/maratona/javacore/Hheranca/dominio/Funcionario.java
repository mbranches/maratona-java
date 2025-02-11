package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2 ");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do construtor de funcionário");
    }

    public Funcionario(String name, String cpf) {
        super(name, cpf);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.name + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
