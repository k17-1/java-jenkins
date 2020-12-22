import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testInit() {
        Calculator calculator = new Calculator();

        assertEquals(
                0,
                calculator.result()
        );
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(10).add(20);

        assertEquals(
                30,
                calculator.result()
        );
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        calculator.add(2).mul(30);

        assertEquals(
                60,
                calculator.result()
        );
    }

    @Test
    public void testClear() {
        Calculator calculator = new Calculator();
        calculator.add(2).zeroed();

        assertEquals(
                0,
                calculator.result()
        );
    }
}
