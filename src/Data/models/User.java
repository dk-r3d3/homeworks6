package Data.models;

public abstract class User {
    protected int id;
    protected String name;
    protected String dateBirth;

    public User(int id, String name, String dateBirth) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }
}
