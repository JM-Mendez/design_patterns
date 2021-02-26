package FizzBuzzStartingpoint;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    
    @Test public void toMessage_should_be_31_for_31() {
        final String expected = "31";
        final String actual = App.toMessage(31);
        assertEquals(expected, actual);
    }


}