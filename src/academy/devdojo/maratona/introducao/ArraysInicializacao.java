package academy.devdojo.maratona.introducao;

public class ArraysInicializacao {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{2, 6, 1};
        arrayInt[2] = new int[]{0, 1, 9, 3, 1, 5};

        int[][] arrayInt2 = {{1, 2, 3, 5, 6}, {0, 3, 1, 6}, {0, 9, 8}, {5, 6, 7, 4}};
        //      new int[4]    new int[5]      new int[4]    new int[3]  new int[4]

        for(int[] arrayBase: arrayInt) {
            System.out.println("------------------------------");
            for (int n: arrayBase) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] arrayBase: arrayInt2) {
            System.out.println("------------------------------");
            for (int n: arrayBase) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
