import org.example.MathUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    private final MathUtils mathUtils = new MathUtils();
    @Test
    void testAdd() {
        assertEquals(7, mathUtils.add(3, 4));
    }

    @Test
    void testSub() {
        assertEquals(3, mathUtils.sub(5, 2));
    }

    @Test
    void testMultipy() {
        assertEquals(12, mathUtils.multiply(4, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, mathUtils.divide(10, 4));
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                ArithmeticException.class, () -> mathUtils.divide(2, 0)
        );
    }

}
