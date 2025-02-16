package academy.devdojo.maratona.colecoes.dominio.teste;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Reflexivo: x.equals(x) == true para tudo que for diferente de null
    //Simétrico: para x e y diferente de null, se x.equals(y) == true logo y.equals(x) == true
    //Transitividade: se x.equals(y) == true, e x.equals(z) == true, logo: y.equals(z) == true
    //Consistente: x.equals(x) sempre is true, se x != null
    //para x != null, x.equals(null) == false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (this.getClass() != obj.getClass()) return false;

        Smartphone smartphone = (Smartphone) obj;

        return this.serialNumber != null && this.serialNumber.equals(smartphone.getSerialNumber());
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
