package academy.praticando.seminario.exec;

import academy.praticando.seminario.dominio.Aluno;
import academy.praticando.seminario.dominio.Local;
import academy.praticando.seminario.dominio.Professor;
import academy.praticando.seminario.dominio.Seminario;

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


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;
        while (true) {
            System.out.print("Título do seminário " + contador + ": ");
            String titulo_seminario = input.nextLine();
//                input.nextLine();

            System.out.print("Quantos professores você deseja adicionar ao seminário " + contador + ": ");
            int qtd_professores = input.nextInt();
            input.nextLine();
            Professor[] professores = new Professor[qtd_professores];

            for (int j = 1; j <= qtd_professores; j++) {
                System.out.print("Nome do professor " + j + ": ");
                String nomeProfessor = input.nextLine();

                System.out.print("Especialização de " + nomeProfessor + ": ");
                String especializacaoProfessor = input.nextLine();

                Professor professor = new Professor(nomeProfessor, especializacaoProfessor);
                professores[j - 1] = professor;
            }

            System.out.println();

            System.out.print("Quantos alunos você deseja adicionar ao seminario: ");
            int qtd_alunos = input.nextInt();
            input.nextLine();
            Aluno[] alunos = new Aluno[qtd_alunos];

            for(int k = 1; k <= qtd_alunos; k++) {
                System.out.print("Nome do aluno " + k + ": ");
                String nome_aluno = input.nextLine();

                System.out.print("Idade de " + nome_aluno + ": ");
                int idade_aluno = input.nextInt();
                input.nextLine();

                Aluno aluno = new Aluno(nome_aluno, idade_aluno);
                alunos[k - 1] = aluno;
            }

            System.out.println();

            System.out.print("Local do seminário " + contador + ": ");
            String endereco = input.nextLine();

            Local local = new Local(endereco);

            Seminario seminario = new Seminario(titulo_seminario, alunos, professores, local);

            System.out.println();

            seminario.imprime();

            char resposta;

            while(true) {
                System.out.print("Criar outro seminário[S/N] ? ");
                resposta = input.nextLine().toUpperCase(Locale.ROOT).charAt(0);
                if (resposta == 'S' || resposta == 'N') break;
            }

            if (resposta == 'N') break;
            contador++;
        }
    }
}
