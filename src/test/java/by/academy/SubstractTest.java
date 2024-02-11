package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class SubstractTest extends Assert{

    @Test
    public void testSubstract() {
        assertEquals(1, Calculator.substract(2, 1));
    }
}
