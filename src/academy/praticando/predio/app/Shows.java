package academy.praticando.predio.app;

import academy.praticando.predio.domain.Apartment;

public class Shows {
    public static void showAp(Apartment apartment) {
        System.out.println("--------------------------------------");
        System.out.println("Number: " + apartment.getNumApartment());
        System.out.println("--------------------------------------");
        System.out.println("Apartment type: " + apartment.getTypeApartment().TYPEAPARTMENT);
        System.out.println("Apartment Value: R$" + apartment.getValueApartment());
        System.out.println("--------------------------------------");
        System.out.println("Owner: " + apartment.getOwner().getName());
        System.out.println("Age: " + apartment.getOwner().getAge());
        System.out.println("CPF: " + apartment.getOwner().getCpf());
        System.out.println();
    }
}


