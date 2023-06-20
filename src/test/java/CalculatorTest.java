import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends StringCalculator {
    @Test
   public void StringCalculatorTest() {
        int result = add("5,6");

        assertThrows(IllegalArgumentException.class, () -> add("5,-1"));

    }

    @Test
    public void StringCalculatorTest2() {
        int result = add("5,2000");

        assertEquals(5, result);
    }


}
