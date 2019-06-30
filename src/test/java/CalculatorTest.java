import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnNothing() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void shouldReturnSum() {
        assertEquals(3, Calculator.add("1,2"));
    }
}