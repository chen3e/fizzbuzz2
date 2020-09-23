package app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testThreesMultiple()
    {
        String expectedResult = "1 2 lucky 4 buzz fizz ";
        assertEquals(expectedResult, App.fizzbuzz(1, 6));
    }

    @Test
    public void testThreesNonMultiple()
    {
        String expectedResult = "11 fizz lucky 14 fizzbuzz ";
        assertEquals(expectedResult, App.fizzbuzz(11, 15));
    }

    @Test
    public void testPositive()
    {
        String expectedResult = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 ";
        assertEquals(expectedResult, App.fizzbuzz(1, 16));
    }

    @Test
    public void testZero()
    {
        String expectedResult = "fizzbuzz ";
        assertEquals(expectedResult, App.fizzbuzz(0, 0));
    }

    @Test
    public void testNegative()
    {
        String expectedResult = "buzz fizz -8 -7 fizz buzz -4 lucky -2 -1 fizzbuzz ";
        assertEquals(expectedResult, App.fizzbuzz(-10, 0));
    }
}
