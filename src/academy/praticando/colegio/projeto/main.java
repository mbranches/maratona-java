package academy.praticando.colegio.projeto;

import academy.praticando.colegio.domain.School;
import academy.praticando.colegio.domain.Teacher;

public class main {
    public static void main(String[] args) {
        School up = new School("Universo Positivo", "Belém");
        Teacher portugues_up = new Teacher("José Neto", "Português");
        Teacher matematica_up = new Teacher("Claudio Martins", "Matemática");
        Teacher[] teachersUp = new Teacher[]{portugues_up, matematica_up};
        up.setTeachers(teachersUp);

        School highSchool = new School("High School", "Boston", "Estados Unidos");
        Teacher geografia_hs = new Teacher("Jeane Veiga", "Geografia");
        Teacher historia_hs = new Teacher("Eduardo Seila", "História");
        Teacher[] teachers_hs = new Teacher[]{historia_hs, geografia_hs};
        highSchool.setTeachers(teachers_hs);

        up.showDatasSchool();

        System.out.println();
        System.out.println();

        highSchool.showDatasSchool();
    }

}
