package stringUtilitiesTests;

import arrayUtilities.StringArrayUtilities;
import org.junit.Assert;
import org.junit.Test;
import stringUtilities.StringUtilities;

public class TestStringUtilities {

    @Test
    public void getIndexOfNthSubstringTest1() {
        // Given
        String baseString = "]]]Hey thereHey there;Hey there[]'";
        String subString = "Hey there";
        Integer nthOccurrence = 2;
        Integer expected = 12;

        // when
        Integer actual = StringUtilities.getIndexOfNthSubstring(baseString, subString, nthOccurrence);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIndexOfNthSubstringTest2() {
        // Given
        String baseString = "1*7!PassingTests-PassingTests.PassingTests;PassingTests'PassingTests";
        String subString= "PassingTests";
        Integer nthOccurrence = 4;
        Integer expected = 43;


        // when
        Integer actual = StringUtilities.getIndexOfNthSubstring(baseString, subString, nthOccurrence);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfOccurrencesTest1() {
        // Given
        String baseString = "]]]Hey thereHey there;Hey there[]'";
        String subString = "Hey there";
        Integer expected = 3;

        // when
        Integer actual = StringUtilities.getNumberOfOccurrences(baseString, subString);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getNumberOfOccurrencesTest2() {
        // Given
        String baseString = "1*7!PassingTests-PassingTests.PassingTests;PassingTests'PassingTests";
        String subString= "PassingTests";
        Integer expected = 5;

        // when
        Integer actual = StringUtilities.getNumberOfOccurrences(baseString, subString);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "The quick brown fox jumps";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "Over the lazy dog";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "1234";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "Over the lazy dog1";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "!&*(";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "Over the lazy dog!";

        // When
        boolean outcome = StringUtilities.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void padLeft10Test() {
        // Given
        String hello = "hello";
        int numberOfUnitsToPad = 10;
        String expected = "     hello";

        // When
        String actual = StringUtilities.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void padLeft15Test() {
        // Given
        String hello = "";
        int numberOfUnitsToPad = 15;
        String expected = "               ";

        // When
        String actual = StringUtilities.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void padLeft20Test() {
        // Given
        String hello = "The quick";
        int numberOfUnitsToPad = 20;
        String expected = "           The quick";

        // When
        String actual = StringUtilities.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void padRight10Test() {
        // Given
        String hello = "hello";
        int numberOfUnitsToPad = 10;
        String expected = "hello     ";

        // When
        String actual = StringUtilities.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void padRight15Test() {
        // Given
        String hello = "";
        int numberOfUnitsToPad = 15;
        String expected = "               ";

        // When
        String actual = StringUtilities.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void padRight20Test() {
        // Given
        String hello = "The quick";
        int numberOfUnitsToPad = 20;
        String expected = "The quick           ";

        // When
        String actual = StringUtilities.padRight(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRepeatHello5Times() {
        // given
        String stringToRepeat = "Hello";
        Integer numberOfTimesToRepeat = 5;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtilities.repeatString(stringToRepeat, numberOfTimesToRepeat);

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRepeatQuickBrown6Times() {
        // given
        String stringToRepeat = "Quick Brown";
        Integer numberOfTimesToRepeat = 6;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtilities.repeatString(stringToRepeat, numberOfTimesToRepeat);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceLastString1() {
        // Given
        String input = "]]]Hey thereHey there;Hey there[]'";
        String expected = "]]]Hey thereHey there;[]'";
        String stringToRemove = "Hey there";

        // when
        String actual = StringUtilities.removeLastSubString(input, stringToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceLastString2() {
        // Given
        String input = "1*7!PassingTests-PassingTests.PassingTests";
        String expected = "1*7!PassingTests-PassingTests.";
        String stringToRemove = "PassingTests";

        // when
        String actual = StringUtilities.removeLastSubString(input, stringToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveNString1() {
        // Given
        String input = "]]]Hey thereHey there;Hey there[]'";
        String expected = "]]]Hey there;Hey there[]'";
        String stringToRemove = "Hey there";
        Integer nthOccurrence = 2;

        // when
        String actual = StringUtilities.removeNthSubstring(input, stringToRemove, nthOccurrence);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveNString2() {
        // Given
        String input = "1*7!PassingTests-PassingTests.PassingTests;PassingTests'PassingTests";
        String expected = "1*7!PassingTests-PassingTests.PassingTests;'PassingTests";
        String stringToRemove = "PassingTests";
        Integer nthOccurrence = 4;


        // when
        String actual = StringUtilities.removeNthSubstring(input, stringToRemove, nthOccurrence);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void camelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "She Sells Sea Shells";

        // When
        String actual = StringUtilities.camelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "sllehs aes slles ehs";

        // When
        String actual = StringUtilities.reverse(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseWordsTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "ehs slles aes sllehs";

        // When
        String actual = StringUtilities.reverseWords(input);

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "he sells sea shell";

        // When
        String actual = StringUtilities.removeFirstAndLastCharacter(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest1() {
        // Given
        String input = "shE sells SEA sHeLlS";
        String expected = "SHe SELLS sea ShElLs";

        // When
        String actual = StringUtilities.invertCasing(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest2() {
        // Given
        String expected = "sHE sELls SEa sHeLlS";

        // When
        String actual = StringUtilities.invertCasing(StringUtilities.invertCasing(expected));

        // Then
        Assert.assertEquals(expected, actual);
    }



}
