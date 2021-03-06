package FizzBuzzComplete;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test public void toMessage_should_be_Fizz_for_9() {
        final String expected = "Fizz";
        final String actual = App.toMessage(9);
        assertEquals(expected, actual);
    }

    @Test public void toMessage_should_be_Buzz_for_20() {
        final String expected = "Buzz";
        final String actual = App.toMessage(20);
        assertEquals(expected, actual);
    }

    @Test public void toMessage_should_be_31_for_31() {
        final String expected = "31";
        final String actual = App.toMessage(31);
        assertEquals(expected, actual);
    }


    @Test public void toMessage_should_be_FizzBuzz_for_15() {
        final String expected = "FizzBuzz";
        final String actual = App.toMessage(15);
        assertEquals(expected, actual);
    }

}

