public class Student {
    private String name;
    private String yearOfStudy;
    private double id;

    public Student(String name, String yearOfStudy, double id) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public double getId() {
        return id;
    }
}