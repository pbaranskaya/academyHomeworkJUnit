package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void testSum() {
        Assert.assertEquals(3, Calculator.sum(2, 1));
    }
}
