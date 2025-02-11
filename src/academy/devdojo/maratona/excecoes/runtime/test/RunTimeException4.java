package academy.devdojo.maratona.excecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeException4 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) { //as mais genéricas vão sempre no final
            System.out.println("RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) { //só com classes de linhagem de herança diferente

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
