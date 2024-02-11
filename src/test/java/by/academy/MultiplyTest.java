package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

    @Test
    public void testMultiply() {
        Assert.assertEquals(2, Calculator.multiply(2, 1));
    }
}
