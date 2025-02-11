package academy.devdojo.maratona.javacore.Npolimorfismo.Test;

import academy.devdojo.maratona.javacore.Npolimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratona.javacore.Npolimorfismo.Servico.RepositorioBancoDeDados;
import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
