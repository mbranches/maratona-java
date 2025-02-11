package academy.devdojo.maratona.excecoes.runtime.test;

public class RunTimeException02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("nafnanfasn");
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
        return a / b;
    }
}
