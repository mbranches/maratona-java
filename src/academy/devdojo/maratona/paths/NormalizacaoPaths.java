package academy.devdojo.maratona.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoPaths {
    public static void main(String[] args) {
        // ../ -> voltar uma pasta
        // ./ -> a pasta que se encontra

        String diretorioProjeto = "home/willian/dev";
        String caminhoArquivo = "../../arquivo.txt";

        Path pathArquivo = Paths.get(diretorioProjeto, caminhoArquivo); //não está normalizado
        System.out.println(pathArquivo  );

        pathArquivo = pathArquivo.normalize();
        System.out.println(pathArquivo);
    }
}
