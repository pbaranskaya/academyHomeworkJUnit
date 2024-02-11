package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class SubstractTest {

    @Test
    public void testSubstract() {
        Assert.assertEquals(1, Calculator.substract(2, 1));
    }
}
