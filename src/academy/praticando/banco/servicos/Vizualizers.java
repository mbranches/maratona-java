package academy.praticando.banco.servicos;

import academy.praticando.banco.dominios.Cliente;
import academy.praticando.banco.dominios.Conta;

public class Vizualizers {
    public static void vizualizarInformacoesCriacaoConta(Cliente cliente) {
        System.out.println("-------------------------");
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cpf: " + cliente.getCpf());
    }

    public static void vizualizarConta(Conta conta) {
        System.out.println("Nome: " + conta.getCliente().getNome());
        System.out.println("Email: " + conta.getCliente().getEmail());
        System.out.println("Cpf: " + conta.getCliente().getCpf());
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}
