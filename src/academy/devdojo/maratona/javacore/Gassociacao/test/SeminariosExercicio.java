package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.ExercicioAluno;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.ExercicioLocal;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.ExercicioProfessor;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.ExercicioSeminario;

import java.util.Locale;
import java.util.Scanner;

/**
*    Crie um sistema que gerencie seminários:
*    O sitema deverá cadastrar seminários, estudantes, professores e local onde será realizado
*    Um aluno poderá estar em apenas um seminário
*    Um seminário poderá ter nenhum ou vários alunos
*    Um seminario podera ter varios professores
*    Um seminário deve ter um local
*
*    Campos básicos (excluindo relacionamento)
*    seminário: título
*    aluno: nome e idade
*    professor: nome, especialidade
*    local: endereço
**/


public class SeminariosExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Quantos seminarios você deseja criar: ");
            int qtd_seminarios = input.nextInt();
            input.nextLine();

            ExercicioSeminario[] seminarios = new ExercicioSeminario[qtd_seminarios];
            for (int i = 1; i <= qtd_seminarios; i++) {
                System.out.print("Título do seminário " + i + ": ");
                String titulo_seminario = input.nextLine();
//                input.nextLine();

                System.out.print("Quantos professores você deseja adicionar ao seminário " + i + ": ");
                int qtd_professores = input.nextInt();
                input.nextLine();
                ExercicioProfessor[] professores = new ExercicioProfessor[qtd_professores];

                for (int j = 1; j <= qtd_professores; j++) {
                    System.out.print("Nome do professor " + j + ": ");
                    String nomeProfessor = input.nextLine();

                    System.out.print("Especialização de " + nomeProfessor + ": ");
                    String especializacaoProfessor = input.nextLine();

                    ExercicioProfessor professor = new ExercicioProfessor(nomeProfessor, especializacaoProfessor);
                    professores[j - 1] = professor;
                }


                System.out.print("Quantos alunos você deseja adicionar ao seminario: ");
                int qtd_alunos = input.nextInt();
                input.nextLine();
                ExercicioAluno[] alunos = new ExercicioAluno[qtd_alunos];

                for(int k = 1; k <= qtd_alunos; k++) {
                    System.out.print("Nome do aluno " + k + ": ");
                    String nome_aluno = input.nextLine();

                    System.out.print("Idade de " + nome_aluno + ": ");
                    int idade_aluno = input.nextInt();
                    input.nextLine();

                    ExercicioAluno aluno = new ExercicioAluno(nome_aluno, idade_aluno);
                    alunos[k - 1] = aluno;
                }

                System.out.print("Local do seminário " + i);
                String endereco = input.nextLine();

                ExercicioLocal local = new ExercicioLocal(endereco);

                ExercicioSeminario seminario = new ExercicioSeminario(titulo_seminario, alunos, professores, local);

                System.out.println();

                seminario.imprime();
            }

            char resposta;

            while(true) {
                System.out.print("Criar outro seminário[S/N] ? ");
                resposta = input.nextLine().toUpperCase(Locale.ROOT).charAt(0);
                if (resposta == 'S' || resposta == 'N') break;
            }

            if (resposta == 'N') break;
        }
    }
}
