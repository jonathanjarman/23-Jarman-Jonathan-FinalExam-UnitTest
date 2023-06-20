import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest implements StringCalculator {
    @Test
   void StringCalculatorTest() {

        assertThrows(IllegalArgumentException.class, () -> add("5","-1"));

    }

    @Test
    void StringCalculatorTest2() {

        assertEquals(5, () -> add("5", "1222"));
    }


}
