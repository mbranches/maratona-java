package academy.praticando.predio.domain;

public enum TypeApartment {
    COMMERCIAL(1, "Commercial"),
    RESIDENTIAL(2, "Residential");

    public final int NUM_TYPEAPARTMENT;
    public final String TYPEAPARTMENT;

    TypeApartment(int numTypeApartment, String typeApartment) {
        this.NUM_TYPEAPARTMENT = numTypeApartment;
        this.TYPEAPARTMENT = typeApartment;
    }

    public static TypeApartment typeNum(int numTypeApartment) {
        for (TypeApartment type : values()) {
            if (type.NUM_TYPEAPARTMENT == numTypeApartment) return type;
        }
        return null;
    }
}
