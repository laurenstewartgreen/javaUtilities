package arrayUtilitiesTests;

import arrayUtilities.StringArrayUtilities;
import org.junit.Assert;
import org.junit.Test;

public class TestStringArrayUtilities {

    @Test
    public void testGetEndingArrayFrom0() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 0;

        // when
        String[] actual = StringArrayUtilities.getEndingArray(input, startIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetEndingArrayFrom1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 1;

        // when
        String[] actual = StringArrayUtilities.getEndingArray(input, startIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndingArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = 98;

        // when
        String[] actual = StringArrayUtilities.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEndingArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = -1;

        // when
        String[] actual = StringArrayUtilities.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom0To2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown"};
        int startIndex = 0;
        int endIndex = 2;

        // when
        String[] actual = StringArrayUtilities.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom1To3() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox"};
        int startIndex = 1;
        int endIndex = 3;

        // when
        String[] actual = StringArrayUtilities.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSubArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 98;
        int endIndex = 99;

        // when
        StringArrayUtilities.getSubArray(input, startIndex, endIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSubArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = -1;
        int endIndex = -10;

        // when
        StringArrayUtilities.getSubArray(input, startIndex, endIndex);
    }

    @Test
    public void firstLetterTest() {
        // Given
        String[] inputArray = {"The", "quick", "brown", "fox"};
        String expected = "Tqbf";

        // When
        String actual = StringArrayUtilities.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstLetterTest2() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String expected = "Sotr";

        // When
        String actual = StringArrayUtilities.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest1() {
        // Given
        String[] inputArray = {"Somewhere", "over", "the", "rainbow"};
        String[] expected = {"rainbow", "the", "over", "Somewhere"};

        // When
        String[] actual = StringArrayUtilities.reverse(inputArray);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseTest2() {
        // Given
        String[] inputArray = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Jumps", "Fox", "Brown", "Quick", "The"};

        // When
        String[] actual = StringArrayUtilities.reverse(inputArray);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }
}
