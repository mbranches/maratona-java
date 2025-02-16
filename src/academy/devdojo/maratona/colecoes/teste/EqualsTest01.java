package academy.devdojo.maratona.colecoes.teste;

import academy.devdojo.maratona.colecoes.dominio.teste.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Iphone");
        Smartphone s2 = new Smartphone("1ABC2", "Iphone");

        System.out.println(s1.equals(s2)); //por padrão o equals compara a posição em memória
    }
}
