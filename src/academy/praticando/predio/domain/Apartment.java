package academy.praticando.predio.domain;

public class Apartment {
    private Owner owner;
    private int numApartment ;
    private TypeApartment typeApartment;
    private double valueApartment;

    public Apartment(Owner owner, int numApartment, TypeApartment typeApartment, double valueApartment) {
        this.owner = owner;
        this.numApartment = numApartment;
        this.typeApartment = typeApartment;
        this.valueApartment = valueApartment;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "owner=(" + owner +
                "), numApartment=" + numApartment +
                ", typeApartment=" + typeApartment +
                ", valueApartment=" + valueApartment +
                '}';
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getNumApartment() {
        return numApartment;
    }

    public void setNumApartment(int numApartment) {
        this.numApartment = numApartment;
    }

    public double getValueApartment() {
        return valueApartment;
    }

    public void setValueApartment(double valueApartment) {
        this.valueApartment = valueApartment;
    }

    public TypeApartment getTypeApartment() {
        return typeApartment;
    }

    public void setTypeApartment(TypeApartment typeApartment) {
        this.typeApartment = typeApartment;
    }
}
