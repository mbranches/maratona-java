package academy.devdojo.maratona.introducao;

public class Array02 {
    public static void main(String[] args) {
        int [] numerosUm = new int[3];
        int [] numerosDois = {1, 2, 3, 4, 5, 6};
        int [] numerosTres = new int[]{1, 2, 3, 4, 5};
        String [] nomes = {"Marcus", "Vinicius", "Lima", "Branches"};

        for (int i = 0; i < numerosTres.length; i++) {
            System.out.println(numerosTres[i]);
        }

        System.out.println();

        for(String nome: nomes) {
            System.out.println(nome);
        }
    }
}
