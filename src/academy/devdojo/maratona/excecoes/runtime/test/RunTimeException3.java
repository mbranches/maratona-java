package academy.devdojo.maratona.excecoes.runtime.test;

public class RunTimeException3 {
    public static void main(String[] args) {

    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o arquivo");
        }
        return null;
    }
}
