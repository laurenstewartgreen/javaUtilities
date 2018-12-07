import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayUtilities {

    @Test
    public void testBubbleSort1() {
        int[] actual = {4, 5, 1, 9, 0, 11, 6};
        int[] expected = {0, 1, 4, 5, 6, 9, 11};
        ArrayUtilities.bubbleSort(actual);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testBubbleSort2() {
        int[] actual = {-5, 29, 375, -11, -145};
        int[] expected = {-145, -11, -5, 29, 375};
        ArrayUtilities.bubbleSort(actual);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void test1SumValuesOfArray() {
        int[] input = {3, 4, 9, 2, 1};
        int expected = 19;
        int actual = ArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2SumValuesOfArray() {
        int[] input = {8};
        int expected = 8;
        int actual = ArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3SumValuesOfArray() {
        int[] input = {6, 5, -3, -2, -6};
        int expected = 0;
        int actual = ArrayUtilities.sumValuesOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1SumDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7};
        double expected = 20.79;
        double actual = ArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test2SumDoublesOfArray() {
        double[] input = {5.24789};
        double expected = 5.24789;
        double actual = ArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test1AverageOfArray() {
        int[] input = {3, 4, 9, 3, 1};
        int expected = 4;
        int actual = ArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2AverageOfArray() {
        int[] input = {8};
        int expected = 8;
        int actual = ArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3AverageOfArray() {
        int[] input = {6, 5, -3, -2, -6};
        int expected = 0;
        int actual = ArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4AverageOfArray() {
        int[] input = {3, 4, 9, 3, 1, 8};
        int expected = 4;
        int actual = ArrayUtilities.averageOfArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1AverageDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7};
        double expected = 4.158;
        double actual = ArrayUtilities.doubleAverageOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test2AverageDoublesOfArray() {
        double[] input = {5.24789};
        double expected = 5.24789;
        double actual = ArrayUtilities.sumDoublesOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test3AverageDoublesOfArray() {
        double[] input = {3.2, 4.55, 9.0, 2.34, 1.7, 3.3};
        double expected = 4.015;
        double actual = ArrayUtilities.doubleAverageOfArray(input);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test1ContainsValue() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 9;

        Assert.assertTrue(ArrayUtilities.containsValue(input, numb));
    }

    @Test
    public void test2ContainsValue() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 11;

        Assert.assertFalse(ArrayUtilities.containsValue(input, numb));
    }

    @Test
    public void test1ReverseArray() {
        int[] actual = {3, 4, 9, 2, 1};
        int[] expected = {1, 2, 9, 4, 3};
        ArrayUtilities.reverseArray(actual);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2ReverseArray() {
        int[] actual = {8, 2};
        int[] expected = {2, 8};
        ArrayUtilities.reverseArray(actual);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test1findIndexOf() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 2;
        int expected = 3;
        int actual = ArrayUtilities.findIndexOf(input, numb);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2findIndexOf() {
        int[] input = {8, 2};
        int numb = 5;
        int expected = -1;
        int actual = ArrayUtilities.findIndexOf(input, numb);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1copyArrayLoop() {
        int[] input = {3, 4, 9, 2, 1};
        int[] actual = ArrayUtilities.copyArrayByLoop(input);

        Assert.assertTrue(Arrays.equals(input, actual));
    }

    @Test
    public void test2copyArrayLoop() {
        int[] input = {8, 2};
        int[] actual = ArrayUtilities.copyArrayByLoop(input);

        Assert.assertTrue(Arrays.equals(input, actual));
    }

    @Test
    public void test1removeElement() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 2;
        int[] output = ArrayUtilities.removeElementFromArray(input, numb);

        Assert.assertFalse(ArrayUtilities.containsValue(output, numb));
    }

    @Test
    public void test2removeElement() {
        int[] input = {8, 2};
        int numb = 2;
        int[] output = ArrayUtilities.removeElementFromArray(input, numb);

        Assert.assertFalse(ArrayUtilities.containsValue(output, numb));
    }

    @Test
    public void test1insertIntoArrayAt() {
        int[] input = {3, 4, 9, 2, 1};
        int numb = 7;
        int index = 4;
        int[] output = ArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = ArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test
    public void test2insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 0;
        int[] output = ArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = ArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test
    public void test3insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 2;
        int[] output = ArrayUtilities.insertIntoArrayAt(input, numb, index);
        int actual = ArrayUtilities.findIndexOf(output, numb);

        Assert.assertEquals(index, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test4insertIntoArrayAt() {
        int[] input = {8, 2};
        int numb = 7;
        int index = 10;
        ArrayUtilities.insertIntoArrayAt(input, numb, index);
    }

    @Test
    public void test1removeDups() {
        int[] input = {3, 4, 9, 2, 1, 3, 9, 3};
        int[] expected = {3, 4, 9, 2, 1};
        int[] actual = ArrayUtilities.removeDupesFromArray(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2removeDups() {
        int[] input = {8, 2, 8, 8, 8, 8, 8, 8, 1};
        int[] expected = {8, 2, 1};
        int[] actual = ArrayUtilities.removeDupesFromArray(input);

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
        ArrayList<Integer> actual = ArrayUtilities.makeMeAnArrayListFromArray(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2ListFromArray() {
        int[] input = {8, 2};
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(2);
        ArrayList<Integer> actual = ArrayUtilities.makeMeAnArrayListFromArray(input);

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
        int[] actual = ArrayUtilities.makeMeAnArrayFromArrayList(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2ArrayFromList() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(8);
        input.add(2);
        int[] expected = {8, 2};
        int[] actual = ArrayUtilities.makeMeAnArrayFromArrayList(input);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test1check2ArraysEqual() {
        int[] input = {3, 4, 9, 2, 1};

        Assert.assertTrue(ArrayUtilities.check2ArraysForEqual(input, input));
    }

    @Test
    public void test2check2ArraysEqual() {
        int[] input1 = {8, 2, 3, 5, 7, 1, 9};
        int[] input2 = {3, 4, 9, 2, 1};

        Assert.assertFalse(ArrayUtilities.check2ArraysForEqual(input1, input2));
    }
}
