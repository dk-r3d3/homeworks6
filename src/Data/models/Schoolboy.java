package Data.models;

/**
 * Здесь и в остальных классах, наследующихся от класса User
 * реализваон принцип Liskov Substitution Principle
 * Т к наследники могут использоваться вместо родительских классов
 */
public class Schoolboy extends User {
    int classNumber;

    public Schoolboy(Integer id, String name, String dateBirth, int classNumber) {
        super(id, name, dateBirth);
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Schoolboy: " +
                "class number - " + classNumber +
                ", id - " + id +
                ", name - '" + name + '\'' +
                ", date birth - '" + dateBirth + '\'';
    }
}
