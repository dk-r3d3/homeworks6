package Data.service;

import Data.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Здесь реализовани принцип Single Responsibility Principle
 * Класс UserService отвечает только за создание, получение объектов класса User
 * Был ПЕРЕНЕСЕН метод toSend, т к он не относится к классу UserService
 * Данный метод был вынесен в UserMethods, и для него был создан MethodsService
 * Так же здесь реализован принцип Interface Segregation Principle
 * Все методы, описанные в интерфейсе, используются в UserService
 */
public class UserService implements DataService {
    List<User> workersList = new ArrayList<>();
    List<User> studentsList = new ArrayList<>();
    List<User> schoolboysList = new ArrayList<>();

    @Override
    public Worker create(int id, String name, String dateBirth, String companyName, String position) {
        Worker worker = new Worker(id, name, dateBirth, companyName, position);
        workersList.add(worker);
        return worker;
    }

    @Override
    public Student create(int id, String name, String dateBirth, String nameInstitution, int course) {
        Student student = new Student(id, name, dateBirth, nameInstitution, course);
        studentsList.add(student);
        return student;
    }

    @Override
    public Schoolboy create(int id, String name, String dateBirth, int classNumber) {
        Schoolboy schoolboy = new Schoolboy(id, name, dateBirth, 4);
        schoolboysList.add(schoolboy);
        return schoolboy;
    }
    /*ПЕРЕНЕС ДАННЫЙ МЕТОД*/
//    @Override
//    public String toSend(String text) {
//        return text;
//    }

    @Override
    public List<User> readSchoolboys() {
        return schoolboysList;
    }

    @Override
    public List<User> readWorkers() {
        return workersList;
    }

    @Override
    public List<User> readStudents() {
        return studentsList;
    }
}
