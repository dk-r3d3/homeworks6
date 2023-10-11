package Data.view;

import Data.models.User;

import java.util.List;

public class InformingView {
    public void sendInform(String text, List<User> listWorkers) {
        for (User users : listWorkers) {
            System.out.println("Система оповещения оповестила пользователя " + users.getName() + " о " + text);
        }
    }
}
