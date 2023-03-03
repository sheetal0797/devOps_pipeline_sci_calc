import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SciCalTest {
    SciCal obj=new SciCal();
    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial of a number for True Positive",120,obj.factorial(5));
        assertEquals("Finding factorial of a number for True Positive",24,obj.factorial(4));

    }

}
