package Data.models;

public class Worker extends User {
    String companyName;
    String position;

    public Worker(int id, String name, String dateBirth, String companyName, String position) {
        super(id, name, dateBirth);
        this.companyName = companyName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "companyName - '" + companyName + '\'' +
                ", position - '" + position + '\'' +
                ", id - " + id +
                ", name - '" + name + '\'' +
                ", date birth - " + dateBirth + '\'';
    }
}
