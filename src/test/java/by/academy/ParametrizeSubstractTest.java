package by.academy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizeSubstractTest extends Assert {

    private int valueA;
    private int valueB;
    private int expected;

    public ParametrizeSubstractTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sum {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][] {
                        { 4, 2, 2 },
                        { 7, 4, 3 },
                        { 5, 1, 4 } });
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.substract(valueA, valueB));
    }
}

