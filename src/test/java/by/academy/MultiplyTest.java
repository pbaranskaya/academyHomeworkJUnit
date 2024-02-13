package by.academy;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest extends Assert{

    @Test
    public void testMultiply() {
        assertEquals(2, Calculator.multiply(2, 1));
    }
}
