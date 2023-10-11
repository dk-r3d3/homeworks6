package Data.view;

import Data.models.User;

import java.util.List;

public class UserView {
    public void showAdded(User user) {
        if (user != null) {
            System.out.println("New user: " + user);
        }
    }

    public void listUsers(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(users);
    }
}
