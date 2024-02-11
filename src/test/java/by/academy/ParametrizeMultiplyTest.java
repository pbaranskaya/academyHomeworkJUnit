package by.academy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizeMultiplyTest extends Assert {

    private int valueA;
    private int valueB;
    private int expected;

    public ParametrizeMultiplyTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:sum {0} and {1} = {2}")
    public static Iterable<Integer[]> dataForTest() {
        return Arrays.asList(
                new Integer[][] {
                        { 2, 1, 2 },
                        { 4, 2, 8 },
                        { 3, 2, 6 } });
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.multiply(valueA, valueB));
    }
}

