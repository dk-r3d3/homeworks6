package Data.models;

public class Student extends User {
    String nameInstitution;
    int course;

    public Student(Integer id, String name, String dateBirth, String nameInstitution, int course) {
        super(id, name, dateBirth);
        this.nameInstitution = nameInstitution;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student: " +
                "nameInstitution - '" + nameInstitution + '\'' +
                ", course - " + course +
                ", id - " + id +
                ", name - '" + name + '\'' +
                ", dateBirth - '" + dateBirth + '\'';
    }
}
