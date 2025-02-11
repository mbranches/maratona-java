package academy.devdojo.maratona.introducao;

public class ArraysExercicio {
    public static void main(String[] args) {
        //12 meses com 30 dias cada
        int[][] meses = new int[12][30];

        //iterator para colocar os 30 dias em cada mes
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                meses[i][j] = j+1;
            }
        }

        for(int[] mes: meses) {
            for (int i = 0; i < mes.length; i++) {
                System.out.println(mes[i]);
            }
        }
    }
}
