import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void shouldReturnSumOfThree() {
        assertEquals(30, Calculator.add("1,2,3,4,5,6,9"));
    }

    @Test
    public void testSum() {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        assertEquals(6, Calculator.sumList(ints));
    }
}