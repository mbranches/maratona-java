package academy.devdojo.maratona.javacore.Aintroducaometodos.dominio;

public class FuncionarioExercicio {
    //crie uma classe funcionario com os seguintes atributos: nome, idade, salário (3 salários devem ser guardados). Crie dois métodos: 1. Para imprimir os dados. 2. Para tirar a média dos salários e imprimir os resultados

    private String nome;
    private int idade;
    private double[] salarios;
    double mediaSalarios;

    public double getMediaSalarios() {
        return mediaSalarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void impressora() {
        System.out.println("============================");
        System.out.println("Funcionário " + this.nome + " de " + this.idade + "anos: ");
        int contador = 0;
        for (double salario : this.salarios) {
            contador++;
            System.out.println("Salário " + contador + ": R$" + salario);
        }
    }

    public void salarioMedio() {
        double somaSalarios = 0;
        int qtdSalarios = this.salarios.length;
        for (double salario : this.salarios) {
            somaSalarios += salario;
        }
        this.mediaSalarios = somaSalarios / qtdSalarios;
        System.out.println("Média dos " + qtdSalarios + " salários: R$" + mediaSalarios);
    }
}
