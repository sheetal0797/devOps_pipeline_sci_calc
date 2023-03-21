import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SciCalTest {

    private static final double DELTA = 1e-15;
    SciCal obj=new SciCal();
    @Test
    public void sqrtTruePositive()
    {
        assertEquals("Finding square root of a number for True Positive", 3, obj.sqrt(9), DELTA);
        assertEquals("Finding square root of a number for True Positive", 4, obj.sqrt(16), DELTA);
    }
    @Test
    public void sqrtFalsePositive()
    {
        assertNotEquals("Finding square root of a number for False Positive", 467, obj.sqrt(25), DELTA);
        assertNotEquals("Finding square root of a number for False Positive", 10089, obj.sqrt(4), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial of a number for True Positive", 6, obj.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, obj.factorial(4), DELTA);

    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals("Finding factorial of a number for False Positive", 1120, obj.factorial(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 1400, obj.factorial(4), DELTA);
    }


    @Test
    public void naturallogTruePositive()
    {
        assertEquals("Finding natural log of a number for True Positive", 0, obj.naturallog(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 2.302585092994046, obj.naturallog(10), DELTA);

    }

    @Test
    public void naturallogFalsePositive()
    {
        assertNotEquals("Finding natural log of a number for False Positive", 6120, obj.naturallog(1), DELTA);
        assertNotEquals("Finding natural log of a number for False Positive", 47, obj.naturallog(100), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals("Finding power of a number for True Positive", 36, obj.power(6, 2), DELTA);
        assertEquals("Finding power of a number for True Positive", 27, obj.power(3, 3), DELTA);

    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals("Finding power of a number for False Positive", 160, obj.power(3, 2), DELTA);
        assertNotEquals("Finding power of a number for False Positive", 257, obj.power(4,2), DELTA);
    }

}
