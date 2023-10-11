import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // внизу пользователи для теста, не стал делать дополнительный функционал для создания этих пользователей
        // чтобы не тратить время на их создание
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Controller controller = new Controller();
        controller.sendRequest(1, "Dmitry", "30.11.98", "Google", "General director");
        controller.sendRequest(9, "Jon", "30.11.95", "Microsoft", "General director");
        controller.sendRequest(2, "Ivan", "11.11.97", "Garvard", 5);
        controller.sendRequest(3, "Oleg", "11.11.95", "MGU", 1);

        while (flag) {
            System.out.println("Если вы хотите получить список всех пользователей, введите - 1 \n" +
                    "Если хотите сделать рассылку, нажмите - 2 \n" +
                    "Завершить работу - 3");
            int start = scanner.nextInt();
            if (start == 1) {
                controller.sendRequest();
            }
            if (start == 2) {
                System.out.println("Введите текст рассылки: ");
                scanner.nextLine();
                String text = scanner.nextLine();
                System.out.println("Введите категорию оповещаемых(students, workers, schoolboys): ");
                String group = scanner.nextLine();
                controller.sendRequest(text, group);
            }
            if (start == 3) {
                flag = false;
            }
        }
    }
}

