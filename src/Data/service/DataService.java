package Data.service;

import Data.models.*;

import java.util.List;

public interface DataService {
    Worker create(int id, String name, String dateBirth, String companyName, String position);

    Student create(int id, String name, String dateBirth, String nameInstitution, int course);

    Schoolboy create(int id, String name, String dateBirth, int classNumber);

    String toSend(String text);

    List<User> readWorkers();

    List<User> readStudents();

    List<User> readSchoolboys();
}
