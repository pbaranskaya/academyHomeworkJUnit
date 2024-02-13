package by.academy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

public class MathTestMax extends Assert {

    @Test
    public void testMax() {
        assertEquals(8, Math.max(3, 8));
    }
}
