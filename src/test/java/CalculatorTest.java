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
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.fact(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.fact(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.fact(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.fact(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 1, calculator.power(1, 3), DELTA);
        assertEquals("Finding power for True Positive", 81, calculator.power(3, 4), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 25, calculator.power(5, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -7, calculator.power(3, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 99, calculator.power(4, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -12, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 60, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.7, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.squareRoot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.squareRoot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.squareRoot(36), DELTA);

    }

}
