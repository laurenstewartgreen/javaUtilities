package arrayUtilitiesTests;

import arrayUtilities.IntArrayUtilities;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestIntArrayUtilities {

    @Test
    public void testBubbleSort1() {
        int[] actual = {4, 5, 1, 9, 0, 11, 6};
        int[] expected = {0, 1, 4, 5, 6, 9, 11};
        IntArrayUtilities.bubbleSort(actual);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testBubbleSort2() {
        int[] actual = {-5, 29, 375, -11, -145};
        int[] expected = {-145, -11, -5, 29, 375};
        IntArrayUtilities.bubbleSort(actual);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void test1SumValuesOfArray() {
        int[] input = {3, 4, 9, 2, 1};
        int expected = 19;
        int actual = IntArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2SumValuesOfArray() {
        int[] input = {8};
        int expected = 8;
        int actual = IntArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3SumValuesOfArray() {
        int[] input = {6, 5, -3, -2, -6};
        int expected = 0;
        int actual = IntArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1SumDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7};
        double expected = 20.79;
        double actual = IntArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test2SumDoublesOfArray() {
        double[] input = {5.24789};
        double expected = 5.24789;
        double actual = IntArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test1AverageOfArray() {
        int[] input = {3, 4, 9, 3, 1};
        int expected = 4;
        int actual = IntArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2AverageOfArray() {
        int[] input = {8};
        int expected = 8;
        int actual = IntArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3AverageOfArray() {
        int[] input = {6, 5, -3, -2, -6};
        int expected = 0;
        int actual = IntArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4AverageOfArray() {
        int[] input = {3, 4, 9, 3, 1, 8};
        int expected = 4;
        int actual = IntArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1AverageDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7};
        double expected = 4.158;
        double actual = IntArrayUtilities.doubleAverageOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test2AverageDoublesOfArray() {
        double[] input = {5.24789};
        double expected = 5.24789;
        double actual = IntArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test3AverageDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7, 3.3};
        double expected = 4.015;
        double actual = IntArrayUtilities.doubleAverageOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test1ContainsValue() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 9;

        Assert.assertTrue(IntArrayUtilities.containsValue(input, numb));
    }

    @Test
    public void test2ContainsValue() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 11;

        Assert.assertFalse(IntArrayUtilities.containsValue(input, numb));
    }

    @Test
    public void test1ReverseArray() {
        int[] actual = {3, 4, 9, 2, 1};
        int[] expected = {1, 2, 9, 4, 3};
        IntArrayUtilities.reverseArray(actual);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2ReverseArray() {
        int[] actual = {8, 2};
        int[] expected = {2, 8};
        IntArrayUtilities.reverseArray(actual);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test1findIndexOf() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 2;
        int expected = 3;
        int actual = IntArrayUtilities.findIndexOf(input, numb);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2findIndexOf() {
        int[] input = {8, 2};
        int numb = 5;
        int expected = -1;
        int actual = IntArrayUtilities.findIndexOf(input, numb);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1copyArrayLoop() {
        int[] input = {3, 4, 9, 2, 1};
        int[] actual = IntArrayUtilities.copyArrayByLoop(input);

        Assert.assertTrue(Arrays.equals(input, actual));
    }

    @Test
    public void test2copyArrayLoop() {
        int[] input = {8, 2};
        int[] actual = IntArrayUtilities.copyArrayByLoop(input);

        Assert.assertTrue(Arrays.equals(input, actual));
    }

    @Test
    public void test1removeElement() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 2;
        int[] output = IntArrayUtilities.removeElementFromArray(input, numb);

        Assert.assertFalse(IntArrayUtilities.containsValue(output, numb));
    }

    @Test
    public void test2removeElement() {
        int[] input = {8, 2};
        int numb = 2;
        int[] output = IntArrayUtilities.removeElementFromArray(input, numb);

        Assert.assertFalse(IntArrayUtilities.containsValue(output, numb));
    }

    @Test
    public void test1insertIntoArrayAt() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 7;
        int index = 4;
        int[] output = IntArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = IntArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test
    public void test2insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 0;
        int[] output = IntArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = IntArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test
    public void test3insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 2;
        int[] output = IntArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = IntArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test4insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 10;
        IntArrayUtilities.insertIntoArrayAt(input, numb, index);
    }

    @Test
    public void test1removeDups() {
        int[] input = {3, 4, 9, 2, 1, 3, 9, 3};
        int[] expected = {3, 4, 9, 2, 1};
        int[] actual = IntArrayUtilities.removeDupesFromArray(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2removeDups() {
        int[] input = {8, 2, 8, 8, 8, 8, 8, 8, 1};
        int[] expected = {8, 2, 1};
        int[] actual = IntArrayUtilities.removeDupesFromArray(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test1listFromArray() {
        int[] input = {3, 4, 9, 2, 1};
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(4);
        expected.add(9);
        expected.add(2);
        expected.add(1);
        ArrayList<Integer> actual = IntArrayUtilities.makeMeAnArrayListFromArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2ListFromArray() {
        int[] input = {8, 2};
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(2);
        ArrayList<Integer> actual = IntArrayUtilities.makeMeAnArrayListFromArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1ArrayFromList() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(3);
        input.add(4);
        input.add(9);
        input.add(2);
        input.add(1);
        int[] expected = {3, 4, 9, 2, 1};
        int[] actual = IntArrayUtilities.makeMeAnArrayFromArrayList(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2ArrayFromList() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(8);
        input.add(2);
        int[] expected = {8, 2};
        int[] actual = IntArrayUtilities.makeMeAnArrayFromArrayList(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test1check2ArraysEqual() {
        int[] input = {3, 4, 9, 2, 1};

        Assert.assertTrue(IntArrayUtilities.check2ArraysForEqual(input, input));
    }

    @Test
    public void test2check2ArraysEqual() {
        int[] input1 = {8, 2, 3, 5, 7, 1, 9};
        int[] input2 = {3, 4, 9, 2, 1};

        Assert.assertFalse(IntArrayUtilities.check2ArraysForEqual(input1, input2));
    }

    @Test
    public void testMerge_withOneElement(){
        //Given
        Integer[] array1 = {9};
        Integer[] array2 = {6};
        Integer[] expected = {9, 6};

        //When
        Integer[] actual = IntArrayUtilities.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMerge_withMultipleElements(){
        //Given
        Integer[] array1 = {5, 1, 8};
        Integer[] array2 = {4, 2};
        Integer[] expected = {5, 1, 8, 4, 2};

        //When
        Integer[] actual = IntArrayUtilities.merge(array1, array2);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateLeft_forOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {1, 8, 4, 2, 5};

        //When
        Integer[] actual = IntArrayUtilities.rotate(array, 1);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateLeft_forMoreThanOne(){
        //Given
        Integer[] array = {5, 1, 8, 4, 2};
        Integer[] expected = {4, 2, 5, 1, 8,};

        //When
        Integer[] actual = IntArrayUtilities.rotate(array, 3);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueDoesNotExist() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 0;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {9, 8, 11};

        // When
        Integer actual = IntArrayUtilities.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInFirstArray() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 1;
        Integer[] array1 = {1, 6, valueToEvaluate};
        Integer[] array2 = {3};

        // When
        Integer actual = IntArrayUtilities.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueExistInSecondArray() {
        // Given
        Integer valueToEvaluate = 9;
        Integer expected = 2;
        Integer[] array1 = {1, 6};
        Integer[] array2 = {valueToEvaluate, valueToEvaluate, 3};

        // When
        Integer actual = IntArrayUtilities.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countOccurrence_whenValueAppearsInBoth() {
        // Given
        Integer valueToEvaluate = 7;
        Integer expected = 7;
        Integer[] array1 = {valueToEvaluate, 1, valueToEvaluate, 8, 84, 5, valueToEvaluate, 9, 8, valueToEvaluate};
        Integer[] array2 = {1, valueToEvaluate, valueToEvaluate, 8, 5, valueToEvaluate, 91};

        // When
        Integer actual = IntArrayUtilities.countOccurrance(array1, array2, valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withOnlyOneElement(){
        //Given
        Integer[] array = {5};
        Integer expected = 5;

        //When
        Integer actual = IntArrayUtilities.mostCommon(array);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMostCommon_withMultipleElements(){
        //Given
        Integer commonValue = 8;
        Integer[] array = {commonValue, 5, 1, 1, commonValue, 5, 5, commonValue, commonValue};

        //When
        Integer actual = IntArrayUtilities.mostCommon(array);

        //Then
        Assert.assertEquals(commonValue, actual);
    }
}
