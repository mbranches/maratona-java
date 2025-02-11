package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.idade = 21;
        estudante01.nome = "Marcus";
        estudante01.sexo = 'M';

        estudante02.idade = 19;
        estudante02.nome = "Maria";
        estudante02.sexo = 'F';

        estudante01.impressora();
        estudante02.impressora();
    }
}
