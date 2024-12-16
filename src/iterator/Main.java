package iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("1001","John"));
        userManagement.addUser(new User("1002","Alice"));
        userManagement.addUser(new User("1003","Donald"));
        userManagement.addUser(new User("1004","Pushpa"));
        userManagement.addUser(new User("1005","Putin"));


        System.out.println(userManagement.getIterator().hasNext());


        while (userManagement.getIterator().hasNext()){
            User user =(User) userManagement.getIterator().next();
            System.out.println(user.getUserId() +" - "+ user.getName());
        }
        System.out.println("Ending");
    }
}
