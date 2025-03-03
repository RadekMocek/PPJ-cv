package app.assignments;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTests {
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("failure - byte arrays not same", expected, actual);
    }
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }
    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
    }
    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }
    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }
    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
        assertSame("should be same", aNumber, aNumber);
    }
}

