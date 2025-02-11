package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2 ");
    }

    public Pessoa(String name) {
        System.out.println("dentro dos construtores de pessoas");
        this.name = name;
    };

    public Pessoa(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void imprime() {
        System.out.println("Nome: " + this.name + ", CPF: " + this.cpf);
        System.out.println("Endereço: Rua " + this.endereco.getRua() + ", cep " + this.endereco.getCep());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
