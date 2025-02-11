package academy.praticando.banco.dominios;

public class Cliente extends Pessoa {
    private String email;
    private String senha;

    public Cliente(String nome, String cpf, String email, String senha) {
        super(nome,cpf);
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
}
