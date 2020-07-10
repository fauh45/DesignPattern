package Singleton;

public class User {
    private static User instance = null;
    private String id;

    private User(String id) {
        this.id = id;
    }

    public static User auth(String id) {
        if (User.instance == null) {
            User.instance = new User(id);

            return User.instance;
        }

        return User.instance;
    }

    public static void deauth() {
        System.out.println("Deauthing...");
        User.instance = null;
    }

    public String getId() {
        return id;
    }
}