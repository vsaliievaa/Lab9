package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .age(20)
                .firstName("Alice")
                .lastName("Webster")
                .occupation("analyst")
                .weight(50)
                .gender("f")
                .build();
        System.out.println(user);
    }
}
