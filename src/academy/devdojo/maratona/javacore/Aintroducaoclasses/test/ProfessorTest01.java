package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "José";
        p1.idade = 32;
        p1.sexo = 'M';
        System.out.println("Nome: " + p1.nome + ", idade: " + p1.idade + ", Sexo: " + p1.sexo);
    }
}
