package DesignPattern.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.addUser(new User("Aditya", 123));
        userManager.addUser(new User("Ada", 1223));
        userManager.addUser(new User("Aya", 1243));
        userManager.addUser(new User("Atya", 1253));

        IteratorImpl iterator = userManager.getIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user);
        }
    }
}
