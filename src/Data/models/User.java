package Data.models;

/**
 * Здесь реализвоан принцип Dependency Inversion Principle
 * Данный абстрактный класс не зависит от деталей
 * Все классы наследующиеся от User, зависят от User, а User
 * в свою очередь, не зависит от классов - наследников (Schoolboy, Student, Worker)
 */
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
