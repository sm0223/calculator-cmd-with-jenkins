import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    public static final double DELTA = 1e-3;
    Calculator calculator = new Calculator();
    @Test
    public void sumTruePositive() {
        assertEquals("Finding Sum for True positive", 20, calculator.sum(15,5), DELTA);
        assertEquals("Finding Sum for True positive", 10, calculator.sum(20,-10), DELTA);
    }
    @Test
    public void sumFalsePositive() {
        assertNotEquals("Finding Sum for False positive", 10, calculator.sum(15,5), DELTA);
        assertNotEquals("Finding Sum for False positive", 30, calculator.sum(20,-10), DELTA);
    }

    @Test
    public void subtractTruePositive() {
        assertEquals("Finding difference for True positive", 10, calculator.subtract(15,5), DELTA);
        assertEquals("Finding difference for True positive", 30, calculator.subtract(20,-10), DELTA);
    }
    @Test
    public void subtractFalsePositive() {
        assertNotEquals("Finding difference for False positive", 20, calculator.subtract(15,5), DELTA);
        assertNotEquals("Finding difference for False positive", 10, calculator.subtract(20,-10), DELTA);
    }

    @Test
    public void multiplyTruePositive() {
        assertEquals("Finding multiply for True positive", 75, calculator.multiply(15,5), DELTA);
        assertEquals("Finding multiply for True positive", -200, calculator.multiply(20,-10), DELTA);
    }
    @Test
    public void multiplyFalsePositive() {
        assertNotEquals("Finding multiply for False positive", 100, calculator.multiply(15,5), DELTA);
        assertNotEquals("Finding multiply for False positive", 200, calculator.multiply(20,-10), DELTA);
    }

    @Test
    public void divideTruePositive() {
        assertEquals("Finding divide for True positive", 3, calculator.divide(15,5), DELTA);
        assertEquals("Finding divide for True positive", -2, calculator.divide(20,-10), DELTA);
    }
    @Test(expected = ArithmeticException.class)
    public void divideWithZeroTruePositive() {
        calculator.divide(15,0);
    }

    @Test
    public void divideFalsePositive() {
        assertNotEquals("Finding divide for False positive", 10, calculator.divide(15,5), DELTA);
        assertNotEquals("Finding divide for False positive", 30, calculator.divide(20,-10), DELTA);
    }

}
