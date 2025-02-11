package academy.praticando.colegio.domain;

public class School {
    private String name;
    private String city;
    private String country = "Brazil";
    private Teacher[] teachers;

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public School(String name, String city, String country) {
        this(name, city);
    }

    public void showDatasSchool() {
        System.out.println("--------------------------");
        System.out.println("School: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("City: " + this.city);
        System.out.println("--------------------------");
        System.out.println("Teachers: ");
        for (Teacher teacher : this.teachers) {
            System.out.println(teacher.getArea() + ": " + teacher.getName());
        }

    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
