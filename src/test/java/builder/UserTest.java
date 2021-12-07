package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testToString() {
        User user = User.builder()
                .age(20)
                .firstName("Alice")
                .lastName("Webster")
                .occupation("analyst")
                .gender("f")
                .weight(50)
                .build();
        Assertions.assertEquals("User(firstName=Alice, lastName=Webster, " +
                "occupations=[analyst], gender=f, age=20, weight=50)", user.toString());
    }

    @Test
    void testEmptyToString() {
        User user = User.builder()
                .build();
        Assertions.assertEquals("User(firstName=null, lastName=null, " +
                "occupations=[], gender=null, age=0, weight=0)", user.toString());
    }

    @Test
    void testBuilder() {
        User user = User.builder()
                .firstName("Bob")
                .age(10)
                .build();

        assertNotNull(user);
    }

    @Test
    void testEmptyBuilder() {
        User user = User.builder()
                .build();

        assertNotNull(user);
    }
}
