package academy.devdojo.maratona.javacore.Hheranca.testes;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Br-316 km8");
        endereco.setCep("67033-000");

//        Pessoa pessoa = new Pessoa("Marcus Branches");
        Pessoa pessoa = new Pessoa("Marcus Branches", "031.103.362-86");
//        pessoa.setCpf();
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println();

        Funcionario funcionario = new Funcionario("José Silva");
        funcionario.setCpf("0111.205.362-45");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
