package academy.devdojo.maratona.javacore.Hheranca.testes;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;

public class OrdemDeInicializacao {
    //Ordem das classes:
    //  0  -> bloco de inicialização static da superclass é executado quando JVM(JAVA MACHINE VIRTUAL) carrega a classe pai
    //  1  -> bloco de inicialização static da subclass é executado quando JVM(JAVA MACHINE VIRTUAL) carrega a classe filha
    //  2° -> ALocado um espaço em memória pro objeto da superclass.
    //  3° -> Os atributos da class pai são inicializados com os valores default ou com os valores passados.
    //  4° -> O bloco de inicialização da superclass é executado na ordem em q aparecem.
    //  5° -> Os construtores da superclass são executados.
    //  6° -> ALocado um espaço em memória pro objeto da subclass.
    //  7° -> Os atributos da class pai são inicializados com os valores default ou com os valores passados.
    //  8° -> O bloco de inicialização da superclass é executado na ordem em q aparecem.
    //  9° -> Os construtores da superclass são executados.

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria");
    }
}
