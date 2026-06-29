package DesignPattern.IteratorPattern;

import java.util.List;

public class IteratorImpl implements Iterator {

    private final List<User> users;
    private int index = 0;

    public IteratorImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean hasNext() {
        return index<users.size();
    }

    @Override
    public Object next() {
        return users.get(index++);
    }
}
