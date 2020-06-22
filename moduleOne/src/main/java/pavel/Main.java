package pavel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        UserService userService = new UserService();
        List<User> users = userService.getUsers();

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        Number[] arr = new Integer[10];
        arr[0] = 1.0;
    }
}
