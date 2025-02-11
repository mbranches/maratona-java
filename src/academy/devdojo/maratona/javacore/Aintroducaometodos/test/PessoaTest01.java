package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jiraya");
        pessoa1.setIdade(51);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }


}
