package Logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculationTest {

    @Test
    public void testAddPositive() {
        Calculator sc = new Calculator();
        int result = sc.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testAddNegative() {
        Calculator sc = new Calculator();
        int result = sc.add(-2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testAddPositiveAndNegative() {
        Calculator sc = new Calculator();
        int result = sc.add(2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositive() {
        Calculator sc = new Calculator();
        int result = sc.sub(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testSubNegative() {
        Calculator sc = new Calculator();
        int result = sc.sub(-2, -2);
        assertEquals(0, result);
    }

    @Test
    public void testSubPositiveAndNegative() {
        Calculator sc = new Calculator();
        int result = sc.sub(2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositive() {
        Calculator sc = new Calculator();
        int result = sc.mul(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testMulNegative() {
        Calculator sc = new Calculator();
        int result = sc.mul(-2, -2);
        assertEquals(4, result);
    }

    @Test
    public void testMulPositiveAndNegative() {
        Calculator sc = new Calculator();
        int result = sc.mul(2, -2);
        assertEquals(-4, result);
    }

    @Test
    public void testDivPositive() {
        Calculator sc = new Calculator();
        int result = sc.div(2, 2);
        assertEquals(1, result);
    }

    @Test
    public void testDivNegative() {
        Calculator sc = new Calculator();
        int result = sc.div(-2, -2);
        assertEquals(1, result);
    }

    @Test
    public void testDivPositiveAndNegative() {
        Calculator sc = new Calculator();
        int result = sc.div(2, -2);
        assertEquals(-1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        Calculator sc = new Calculator();
        sc.div(2, 0);
    }
}
