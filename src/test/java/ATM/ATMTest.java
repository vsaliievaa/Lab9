package ATM;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream output = System.out;

    @Test
    void handle() {
        System.setOut(new PrintStream(outputStream));
        ATM atm = new ATM();
        int amount = 215;
        atm.handle(amount);
        String result = "Please receive 1 of 5 UAH bills.\n" +
                "Please receive 1 of 10 UAH bills.\n" +
                "Please receive 10 of 20 UAH bills.\n";
        assertEquals(result, outputStream.toString());
    }

    @Test
    void handleWithWrongAmount() {
        System.setOut(new PrintStream(outputStream));
        ATM atm = new ATM();
        int amount = 31;

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            atm.handle(amount);
        });

        Assertions.assertEquals("The ATM doesn't have enough bills to hand out your sum.", thrown.getMessage());

    }
}