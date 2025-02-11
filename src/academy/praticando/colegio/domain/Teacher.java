package academy.praticando.colegio.domain;

public class Teacher {
    private String name;
    private String area;

    public Teacher(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
}
