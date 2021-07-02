package e2;

public class Main {
    public static void main(String[] args) {
        User user = new User("Gonzalo", "Olvera",31, "1", true);

        System.out.println(user.getName());
        user.setName("Carlos");
        System.out.println(user.getName());



    }
}
