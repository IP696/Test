package pavel;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private String hz;

    /**
     * Get systems statuses if down connections skip intervals is configured.
     * Must be non-empty.
     * @return
     */
    public List getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User());
        return users;
    }
}
