import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends StringCalculator {
    @Test
   void StringCalculatorTest() {
        int result = add("5,6");

        assertThrows(IllegalArgumentException.class, () -> add("5,6"));

    }

    @Test
    void StringCalculatorTest2() {

        assertEquals(5,add(String.valueOf(5), String.valueOf(2000)));
    }


}
