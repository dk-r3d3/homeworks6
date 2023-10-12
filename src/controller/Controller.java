package controller;

import Data.models.*;
import Data.service.DataService;
import Data.service.MethodsService;
import Data.service.UserService;
import Data.view.InformingView;
import Data.view.UserView;

import java.util.List;

/**
 * Здесь реализован принцип Open-Closed Principle
 * чтобы расширить возможности класса контроллера - не надо модификаций
 * достаточно добавить либо новый метод, либо новую перегрузку sendRequest
 */
public class Controller {
    DataService dataService;
    MethodsService methodsService;
    UserView userView;
    InformingView informingView;

    public Controller() {
        this.dataService = new UserService();
        this.userView = new UserView();
        this.informingView = new InformingView();
        this.methodsService = new MethodsService() {
            @Override
            public String toSend(String text) {
                return null;
            }
        };
    }


    public void sendRequest(int id, String name, String dateBirth, String companyName, String position) {
        Worker worker = dataService.create(id, name, dateBirth, companyName, position);
        userView.showAdded(worker);
    }

    public void sendRequest(int id, String name, String dateBirth, String nameInstitution, int course) {
        Student student = dataService.create(id, name, dateBirth, nameInstitution, course);
        userView.showAdded(student);
    }

    public void sendRequest(int id, String name, String dateBirth, int classNumber) {
        Schoolboy schoolboy = dataService.create(id, name, dateBirth, classNumber);
        userView.showAdded(schoolboy);
    }

    public void sendRequest(String text, String group) {
        String resTxt = methodsService.toSend(text);
        switch (group) {
            case "workers":
                List<User> listWorkers = dataService.readWorkers();
                informingView.sendInform(resTxt, listWorkers);
                break;
            case "schoolboys":
                List<User> listSchoolboys = dataService.readSchoolboys();
                informingView.sendInform(resTxt, listSchoolboys);
                break;
            case "students":
                List<User> listStudents = dataService.readStudents();
                informingView.sendInform(resTxt, listStudents);
                break;
        }
    }

    public void sendRequest() {
        List<User> workers = dataService.readWorkers();
        List<User> students = dataService.readStudents();
        List<User> schoolboys = dataService.readSchoolboys();
        userView.listUsers(workers);
        userView.listUsers(students);
        userView.listUsers(schoolboys);
    }
}
