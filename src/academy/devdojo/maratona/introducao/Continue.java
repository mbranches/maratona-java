package academy.devdojo.maratona.introducao;

public class Continue {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição: valor da parcela tem que ser >= 1000
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela >=1000) {
                System.out.println(parcela + "x de: " + valorParcela );
                continue;
            }
            System.out.println("Quebrando");
            break;
        }
    }
}
