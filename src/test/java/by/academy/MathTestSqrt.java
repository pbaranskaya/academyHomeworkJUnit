package by.academy;
import org.junit.Assert;
import org.junit.Test;

public class MathTestSqrt extends Assert {

    @Test
    public void testSqrt() {
        assertEquals(5, (int) Math.sqrt(25));
    }

//    @Test
//    public void testSqrt() {
//        assertEquals(5.0, Math.sqrt(25),1.0E-12);
//    }
}
