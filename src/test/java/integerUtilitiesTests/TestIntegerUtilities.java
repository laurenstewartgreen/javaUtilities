package integerUtilitiesTests;

import integerUtilities.IntegerUtilities;
import org.junit.Assert;
import org.junit.Test;

public class TestIntegerUtilities {

    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 15;

        // : When
        Integer actual = IntegerUtilities.getSumOfNumbersUpTo(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSumTest2() {
        // : Given
        Integer input = 15;
        Integer expected = 120;

        // : When
        Integer actual = IntegerUtilities.getSumOfNumbersUpTo(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSumTest3() {
        // : Given
        Integer input = 0;
        Integer expected = 0;

        // : When
        Integer actual = IntegerUtilities.getSumOfNumbersUpTo(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
