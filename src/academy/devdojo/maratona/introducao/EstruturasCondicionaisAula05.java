package academy.devdojo.maratona.introducao;

public class EstruturasCondicionaisAula05 {
    public static void main(String[] args) {
        //idade < 15 cat:infantil
        //idade >= 15 && idade < 18 juvenil
        //idade > 18 cat: adulto
        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria: Infantil";
        } else if (idade < 18) {
            categoria = "Categoria: Juvenil";
        } else {
            categoria = "Categoria: Adulto";
        }
        System.out.println(categoria);
    }
}

