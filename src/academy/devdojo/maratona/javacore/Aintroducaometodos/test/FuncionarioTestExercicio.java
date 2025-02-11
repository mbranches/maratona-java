package academy.devdojo.maratona.javacore.Aintroducaometodos.test;

import academy.devdojo.maratona.javacore.Aintroducaometodos.dominio.FuncionarioExercicio;

public class FuncionarioTestExercicio {
    public static void main(String[] args) {
        FuncionarioExercicio funcionario1 = new FuncionarioExercicio();
        funcionario1.setNome("Sanji");
        funcionario1.setIdade(23);
        funcionario1.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario1.impressora();
        funcionario1.salarioMedio();
        System.out.println(funcionario1.getMediaSalarios());
    }
}
