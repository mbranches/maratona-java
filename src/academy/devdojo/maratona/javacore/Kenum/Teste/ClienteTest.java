package academy.devdojo.maratona.javacore.Kenum.Teste;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcus", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Vinicius", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoCliente.tipoClienteNum(2));
    }
}
