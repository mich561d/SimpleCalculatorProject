package integrationtests;

import Utils.HttpClient;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class WebCalculatorTest {

    @Test
    public void testAdd() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        String res = client.makeHttpRequest("?operation=add&n1=2&n2=3");
        assertEquals("Result of: 2+3= 5", res);
    }

    @Test(expected = IOException.class)
    public void testAddIllegal() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        client.makeHttpRequest("?operation=add&n1=a&n2=3");
    }

    @Test
    public void testSub() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        String res = client.makeHttpRequest("?operation=sub&n1=2&n2=3");
        assertEquals("Result of: 2-3= -1", res);
    }

    @Test(expected = IOException.class)
    public void testSubIllegal() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        client.makeHttpRequest("?operation=sub&n1=a&n2=3");
    }

    @Test
    public void testMul() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        String res = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
        assertEquals("Result of: 2*3= 6", res);
    }

    @Test(expected = IOException.class)
    public void testMulIllegal() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        client.makeHttpRequest("?operation=mul&n1=a&n2=3");
    }

    @Test
    public void testDiv() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        String res = client.makeHttpRequest("?operation=div&n1=2&n2=3");
        assertEquals("Result of: 2/3= 0", res);
    }

    @Test(expected = IOException.class)
    public void testDivIllegal() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/SimpleCalculatorProject/calculator");
        client.makeHttpRequest("?operation=div&n1=a&n2=3");
    }
}
