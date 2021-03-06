package manager;

import user.AdminUser;
import user.CommonUser;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void createCommonUser(String name, String description) {
        CommonUser user = new CommonUser(name, description);
        users.add(user);
        System.out.println("Create user successful, name:" + user.getUserName() +
                " description:" + user.getDescription());
    }

    public void createAdminUser(String name, String description) {
        AdminUser user = new AdminUser(name, description);
        users.add(user);
    }

    public boolean removeUser(int i) {
        if (i >= 0 && i < users.size()) {
            users.remove(i);
            return true;
        }
        return false;
    }

    public List<User> getUsers() {
        return users;
    }
}
