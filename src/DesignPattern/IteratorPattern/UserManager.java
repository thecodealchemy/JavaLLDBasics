package DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users =  new ArrayList<User>();
    public void addUser(User user) {
        users.add(user);
    }

    public IteratorImpl getIterator() {
        return new IteratorImpl(users);
    }
}
