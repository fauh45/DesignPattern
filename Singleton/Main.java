package Singleton;

public class Main {
    public static void main(String[] args) {
        User currentUser;

        currentUser = User.auth("Yeet#1");
        readName(currentUser);

        currentUser = User.auth("Yeet#2");
        readName(currentUser);

        User.deauth();
        currentUser = User.auth("Yeet#2");
        readName(currentUser);
    }

    public static void readName(User currentUser) {
        System.out.println("Current user : " + currentUser.getId());
    }
}