package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class SumTest extends Assert{

    @Test
    public void testSum() {
        assertEquals(3, Calculator.sum(2, 1));
    }
}
